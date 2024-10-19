class Solution {

    // Function to round a number represented as a string to the nearest integer
    String roundToNearest(String str) {
        
        // Get the length of the input string and initialize carry to 0
        int n = str.length(), carry = 0, i = n - 1;
        
        // Check the last digit in the string
        // If the last digit is greater than '5', we need to round up, so we add 1 to carry
        if (str.charAt(i) > '5') {
            carry++; // Increase carry to round up
        }
        
        // Create a StringBuilder to store the result
        StringBuilder sb = new StringBuilder();
        
        // Insert "0" at the end to handle the rounded last digit case (either rounding or staying the same)
        sb.append("0");
        i--; // Move to the second last digit
        
        // Process each digit from right to left
        while (i >= 0) {
            
            // Add the carry to the current digit (subtract '0' to convert char to an integer)
            int val = carry + (str.charAt(i) - '0');
            
            // Insert the last digit of val at the start of the result
            sb.insert(0, val % 10);
            
            // Update carry for the next digit (this will be 1 if val was 10 or more, otherwise 0)
            carry = val / 10;
            i--; // Move to the next digit on the left
        }
        
        // If there's any leftover carry (for example, if we rounded 999 to 1000), insert "1" at the start
        if (carry > 0) {
            sb.insert(0, "1");
        }
        
        // Return the final rounded string
        return sb.toString();
    }
}
