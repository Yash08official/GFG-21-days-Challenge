class Solution {
    public int minimizeCost(int k, int arr[]) {
        // Get the length of the array
        int n = arr.length;
        
        // Initialize a dynamic programming array with Integer.MAX_VALUE values
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        // The cost to reach the first stone is 0
        dp[0] = 0;

        // Iterate over each stone from the second stone to the last stone
        for (int i = 1; i < n; i++) {
            // Iterate over all possible previous stones that are within k steps
            for (int j = Math.max(0, i - k); j < i; j++) {
                // Calculate the minimum cost to reach the current stone
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }

        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}