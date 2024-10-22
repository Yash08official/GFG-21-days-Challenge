# Sub-arrays with equal number of occurences

Given an array arr[] and two integers say, x and y, find the number of sub-arrays in which the number of occurrences of x is equal to the number of occurrences of y.

Examples:

```bash
Input: arr[] = [1, 2, 1] , x= 1 , y = 2
Output: 2
Explanation: The possible sub-arrays have same equal number of occurrences of x and y are:
1) [1, 2], x and y have same occurrence(1).
2) [2, 1], x and y have same occurrence(1).
```

```bash
Input: arr[] = [1, 2, 1] , x = 4 , y = 6
Output: 6
Explanation: The possible sub-arrays have same equal number of occurrences of x and y are:
1) [1], x and y have same occurrence(0).
2) [2], x and y have same occurrence(0).
3) [1], x and y have same occurrence(0).
4) [1, 2], x and y have same occurrence(0).
5) [2, 1], x and y have same occurrence(0).
6) [1, 2, 1], x and y have same occurrence(0).
```

```bash
Input: arr[] = [1, 2, 1] , x= 1 , y = 4
Output: 1
Explanation: The possible sub-array have same equal number of occurrences of x and y is: [2], x and y have same occurrence(0)
```

Constraints:
1 <= arr.size() <= 106
1 <= arr[i], x, y<=106

### Solution

#### Java

```java
class Solution {
    static int sameOccurrence(int arr[], int x, int y) {
        // Create a HashMap to store the difference (fa - fb) as the key and the count of such differences as the value.
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  // Initialize the map with the difference of 0 occurring once.

        int fa = 0, fb = 0, ans = 0;  // fa: count of x, fb: count of y, ans: stores the result

        // Iterate over each element in the array
        for(int i : arr) {
            // If the element is equal to x, increase fa (count of x)
            if(i == x)
                fa++;
            // If the element is equal to y, increase fb (count of y)
            else if(i == y)
                fb++;

            // Check how many times the current difference (fa - fb) has been seen before
            // and add the count to the result (ans).
            ans += map.getOrDefault(fa - fb, 0);

            // Update the map by adding 1 to the count of this difference (fa - fb)
            map.merge(fa - fb, 1, Integer::sum);  // Integer::sum will handle adding 1 to the existing value.
        }

        return ans;  // Return the final answer
    }
}
```
