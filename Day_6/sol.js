
// User function Template for javascript
/**
 * @param {number[]} arr
 * @param {number} k
 * @returns {number}
 */

class Solution {
    // Function to get the minimum difference between the heights.
    getMinDiff(arr, k) {
        arr.sort((a, b) => a - b);
        let n = arr.length;
        let ans = arr[n - 1] - arr[0];

        for (let i = 1; i < n; i++) {
            // 0 to i-1 value inc.
            // i to n-1 value dec.

            // before dec check if it is still stays +ve
            if (arr[i] - k < 0) continue;

            let min = Math.min(arr[0] + k, arr[i] - k);
            let max = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, max - min);
        }
        return ans;
    }
}