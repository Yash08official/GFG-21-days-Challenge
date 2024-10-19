class Solution {
    roundToNearest(str) {
        // Get the length of the input string and initialize carry to 0
        let n = str.length;
        let carry = 0;
        let i = n - 1;

        // Check the last digit in the string
        // If the last digit is greater than '5', we need to round up, so we add 1 to carry
        if (str.charAt(i) > '5') {
            carry++; // Increase carry to round up
        }

        // Create an array to store the result as manipulating strings directly is inefficient
        let result = [];
        
        // Insert "0" at the end to handle the rounded last digit case (either rounding or staying the same)
        result.push("0");
        i--; // Move to the second last digit

        // Process each digit from right to left
        while (i >= 0) {
            // Add the carry to the current digit (subtract '0' to convert char to an integer)
            let val = carry + (str.charAt(i) - '0');

            // Insert the last digit of val at the beginning of the result
            result.unshift(val % 10);

            // Update carry for the next digit (this will be 1 if val was 10 or more, otherwise 0)
            carry = Math.floor(val / 10);
            i--; // Move to the next digit on the left
        }

        // If there's any leftover carry (for example, if we rounded 999 to 1000), insert "1" at the beginning
        if (carry > 0) {
            result.unshift("1");
        }

        // Return the final rounded string by joining the result array into a string
        return result.join('');
    }
}
