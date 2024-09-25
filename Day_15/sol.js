/**
 * @param {number[]} arr
 * @returns {number}
 */

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
     maxStep(arr) {
        let ans = 0, cur = 0, n = arr.length;
        
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