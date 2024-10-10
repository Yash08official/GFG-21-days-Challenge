# Max distance between same elements

Given an array arr[] with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note: You may assume that every input array has repetitions.

Examples:

```bash
Input: arr = [1, 1, 2, 2, 2, 1]
Output: 5
Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max distance is 5.
```

```bash
Input: arr = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
Output: 10
Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
```

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 109

### Solution

#### Java

```java
class Solution {
    public int maxDistance(int[] arr) {

        // Use of map here first
        Map<Integer,Integer> map  = new HashMap<>();

        // we need to find length of arr and index (ans) is 0
        int n  =arr.length, ans=0;

        // we need a for loop now
        for(int i=0;i<n;i++){

            // if element present or map contains the element
            if(map.containsKey(arr[i])){

                // current index - previous index present in map
                int diff = i-map.get(arr[i]);
                // update the answer
                ans=  Math.max(ans,diff);
            }else{

                //if not present then add current element with index
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}
```
