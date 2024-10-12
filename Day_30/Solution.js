class Solution {
    // Function to pair with max sum in the array.
    pairWithMaxSum(arr) {
        let n = arr.length;
        // If the array has only one element, return -1
        if (n === 1) return -1;
        
        let ans = 0;
        // Loop through the array and calculate the sum of consecutive pairs
        for (let i = 0; i < n - 1; i++) {
            let cur = arr[i] + arr[i + 1];
            // Update 'ans' to the maximum sum found
            ans = Math.max(ans, cur);
        }
        // Return the maximum sum of consecutive pairs
        return ans;
    }
}
