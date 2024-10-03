class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        
         // If the input list is empty, return -1 as a list
        if (nums.isEmpty()) return Arrays.asList(-1);
        
        // Intailly the candidates are 
        Integer a = null; // Candidate 1
        Integer b = null; // Candidate 2
        int c1 = 0; // Count for Candidate 1
        int c2 = 0; // Count for Candidate 2
        int n = nums.size(); // Total number of elements in the list
        
        
        // Now we have to find the potential candiadates 
        // so we used for loop
         for (int i : nums)
        {
             
             // If the current number matches Candidate 1
            if (a != null && a.equals(i)) {
                c1++;    // Increase count for Candidate 1
            } 
            
            // If the current number matches Candidate 2
            else if (b != null && b.equals(i)) {
                c2++;   // Increase count for Candidate 2    
            }
            
            // If Candidate 2 count is zero, assign the current number as Candidate 2
            else if (c2 == 0) {
                b = i; // Set current number as Candidate 2
                c2 = 1; // Reset count for Candidate 2
            }
            
            // If current number doesn't match candidate
            else {
                c1--; // Decrease count for Candidate 1
                c2--; // Decrease count for Candidate 2
            }
        }
        
        // Now we have to count how many times the candiadate appears
        c1 = 0; // Reset count for Candidate 1
        c2 = 0; // Reset count for Candidate 2
        
        // and  Create a list to store valid candidate
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        // used Loop  to count occurrences of candidate
        for (int i : nums) 
        {
            if (i.equals(a)) c1++; // Count Candidate 1
            else if (i.equals(b)) c2++; // Count Candidate 2
        }
        
        // now we check candidates meets the condition more than (n/3)
        
        // // If Candidate 1 count is greater than n/3, add to results
        if (c1 > n / 3) ans.add(a); 
        // If Candidate 2 count is greater than n/3, add to results
        if (c2 > n / 3) ans.add(b); 
        
        // If no candidates found, return -1 as a list
        // otherwise, return the list of candidate
        return ans.isEmpty() ? Arrays.asList(-1) : ans;
    }
}
