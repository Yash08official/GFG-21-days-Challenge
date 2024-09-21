/**
 * @param {string} str
 * @returns {number}
 */
class Solution {
    lps(str) {
        // Initialize variables
        let n = str.length;
        let a = new Array(n).fill(0);
        let j = 0;

        // Iterate through the string
        for (let i = 1; i < n;) {
            // If characters match, update the lps array and move both pointers
            if (str.charAt(i) === str.charAt(j)) {
                a[i] = j + 1;
                j++;
                i++;
            } else {
                // If characters don't match and j is not at the start, move j to the previous lps value
                if (j === 0) {
                    i++;
                } else {
                    j = a[j - 1];
                }
            }
        }

        // Return the last value in the lps array
        return a[n - 1];
    }
}