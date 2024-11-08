class Solution {
    static int minRepeats(String s1, String s2) {
        // Step 1: Early exit if s2 contains characters not in s1
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains(String.valueOf(s2.charAt(i)))) {
                return -1;
            }
        }
        
        // Step 2: Initialize variables
        int count = 1; // start with one repeat of s1
        StringBuilder sb = new StringBuilder(s1);
        
        // Step 3: Keep appending s1 until it reaches or exceeds s2's length
        while (sb.length() < s2.length()) {
            sb.append(s1);
            count++;
        }
        
        // Step 4: Check if s2 is now a substring of sb
        if (sb.toString().contains(s2)) {
            return count;
        }
        
        // Step 5: Append s1 one more time and check again
        sb.append(s1);
        count++;
        
        if (sb.toString().contains(s2)) {
            return count;
        }
        
        // If s2 is still not a substring, return -1
        return -1;
    }
}
