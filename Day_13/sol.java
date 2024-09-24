class Solution {
    public static String smallestWindow(String s, String p) {
        // Initialize arrays to store the frequency of characters in p and s
        int pa[] = new int[26], sa[] = new int[26];
        
        // Store the length of p and s
        int pn = p.length(), sn = s.length();
        
        // Initialize a variable to keep track of the number of characters in p that are found in the current window
        int find = 0;
        
        // Count the frequency of each character in p
        for(char i : p.toCharArray()){
            pa[i - 'a']++;
        }
        
        // Initialize two pointers, i and j, to represent the start and end of the window
        int i = 0, j = 0;
        
        // Initialize a variable to store the smallest window found so far
        String ans = "";
        
        // Iterate through the string s
        while(j < sn){
            
            // Get the character at the current position j
            char c = s.charAt(j);
            
            // Increment the frequency of the character in the window
            sa[c - 'a']++;
            
            // If the frequency of the character in the window is less than or equal to the frequency in p, increment find
            if(sa[c - 'a'] <= pa[c - 'a']) find++;
            
            // While the window contains all characters of p
            while(find == pn){
                
                // If the current window is smaller than the smallest window found so far, update ans
                if(ans.isEmpty() || j - i + 1 < ans.length()){
                    ans = s.substring(i, j + 1);
                }
                
                // Get the character at the start of the window
                c = s.charAt(i);
                
                // Decrement the frequency of the character in the window
                sa[c - 'a']--;
                
                // If the frequency of the character in the window is less than the frequency in p, decrement find
                if(sa[c - 'a'] < pa[c - 'a']) find--;
                
                // Move the start of the window to the right
                i++;
            }
            // Move the end of the window to the right
            j++;
        }
        
        // Return the smallest window found, or "-1" if no window is found
        return ans.isEmpty() ? "-1" : ans;
    }
}