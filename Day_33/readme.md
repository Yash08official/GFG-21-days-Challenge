# Subarray range with given sum

Given an unsorted array of integers arr[], and a target tar, determine the number of subarrays whose elements sum up to the target value.

Examples:

```bash
Input: arr[] = [10, 2, -2, -20, 10] , tar = -10
Output: 3
Explanation: Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10].
```

```bash
Input: arr[] = [1, 4, 20, 3, 10, 5] , tar = 33
Output: 1
Explanation: Subarray with sum 33 is: [20,3,10].
```

Expected Time Complexity: O(n)
Expected Auxilary Space: O(n)

Constraints:
1 <= arr.size() <= 106
-105 <= arr[i] <= 105
-105 <= tar <= 105

### Solution

#### Java

```java
class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cur=0, ans=0;
        for(int i:arr){
            cur+=i;
            ans+=map.getOrDefault(cur-tar,0);
            map.merge(cur,1,Integer::sum);
        }
        return ans;
    }
}
```
