class Solution {
    // Function to minimize the cost of reducing the heights.
    minimizeCost(k, arr) {
        // Get the length of the array
        let n = arr.length;
        
        // Initialize a dynamic programming array with Infinity values
        let dp = new Array(n).fill(Infinity);
        
        // The cost to reach the first stone is 0
        dp[0] = 0;

        // Iterate over each stone from the second stone to the last stone
        for (let i = 1; i < n; i++) {
            // Iterate over all possible previous stones that are within k steps
            for (let j = Math.max(0, i - k); j < i; j++) {
                // Calculate the minimum cost to reach the current stone
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }

        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}