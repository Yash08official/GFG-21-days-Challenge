class Solution {
    // Method to count pairs with a given difference `k` in the array `arr`
    public int countPairsWithDiffK(int[] arr, int k) {
        // Declare a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = 0; // Initialize the answer to store the count of valid pairs
        
        // Traverse each element in the array
        for (int i : arr) {
            // Add the count of occurrences where (element + k) or (element - k) exists
            ans += map.getOrDefault(i + k, 0); // Check for pairs where difference with `i` is `+k`
            ans += map.getOrDefault(i - k, 0); // Check for pairs where difference with `i` is `-k`
            
            // Increment the frequency of the current element in the map
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // Return the total count of valid pairs
        return ans;
    }
}