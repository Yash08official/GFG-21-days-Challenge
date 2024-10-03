class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Initialize variables
        int max = Integer.MAX_VALUE; // Set max to the largest possible integer
        int a = max; // Candidate 1
        int b = a; // Candidate 2
        int c1 = 0; // Count for Candidate 1
        int c2 = 0; // Count for Candidate 2
        int n = nums.size(); // Total number of elements in the list
        
        // Step 1: Find potential candidates
        for (int i : nums) {
            // If the current number matches Candidate 1
            if (a == i) {
                c1++; // Increase count for Candidate 1
            // If the current number matches Candidate 2
            } else if (b == i) {
                c2++; // Increase count for Candidate 2
            // If Candidate 1's count is zero, assign the current number as Candidate 1
            } else if (c1 == 0) {
                a = i; // Set current number as Candidate 1
                c1 = 1; // Reset count for Candidate 1
            // If Candidate 2's count is zero, assign the current number as Candidate 2
            } else if (c2 == 0) {
                b = i; // Set current number as Candidate 2
                c2 = 1; // Reset count for Candidate 2
            // If current number doesn't match either candidate
            } else {
                c1--; // Decrease count for Candidate 1
                c2--; // Decrease count for Candidate 2
            }
        }
        
        // Step 2: Count how many times each candidate appears
        c1 = 0; // Reset count for Candidate 1
        c2 = 0; // Reset count for Candidate 2
        ArrayList<Integer> ans = new ArrayList<>(); // Create a list to store valid candidates
        
        // Loop through the original list to count occurrences of candidates
        for (int i : nums) {
            if (i == a) c1++; // Count Candidate 1
            else if (i == b) c2++; // Count Candidate 2
        }
        
        // Step 3: Check if candidates meet the condition (more than n/3)
        if (c1 > n / 3) ans.add(a); // If Candidate 1's count is greater than n/3, add to results
        if (c2 > n / 3) ans.add(b); // If Candidate 2's count is greater than n/3, add to results
        
        // If no candidates found, return -1 as a list; otherwise, return the list of candidates
        if (ans.size() == 0) return Arrays.asList(-1);
        return ans;
    }
}
