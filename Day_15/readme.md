# Roof Top

You are given the heights of consecutive buildings. You can move from the roof of a building to the roof of the next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

```bash
Input: arr[] = [1, 2, 2, 3, 2]
Output: 1
Explanation: 1, 2, or 2, 3 are the only consecutive buildings with increasing heights thus maximum number of consecutive steps with an increase in gain in altitude would be 1 in both cases.
```

```bash
Input: arr[] = [1, 2, 3, 4]
Output: 3
Explanation: 1 to 2 to 3 to 4 is the jump of length 3 to have a maximum number of buildings with increasing heights, so maximum steps with increasing altitude becomes 3.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 105

## Solution

```java
class Solution {
    public int maxStep(int arr[]) {
        int ans=0, cur=0, n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                cur++;
            }else{
                cur=0;
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
```

## JavaScript

```js
/**
 * @param {number[]} arr
 * @returns {number}
 */

class Solution {
  // Function to find maximum number of consecutive steps
  // to gain an increase in altitude with each step.
  maxStep(arr) {
    let ans = 0,
      cur = 0,
      n = arr.length;

    for (let i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        cur++;
      } else {
        cur = 0;
      }
      ans = Math.max(ans, cur);
    }

    return ans;
  }
}
```
