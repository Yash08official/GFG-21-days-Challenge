/**
 * @param {string} str
 * @returns {string}
 */

class Solution {
    // Function to reverse words in a given string.
    reverseWords(str) {
        let ans = '';
        let n = str.length, i = 0;
        while (i < n) {
            let c = str.charAt(i);
            
            if (c === '.') {
                i++;
                continue;
            }
            
            let temp = '';
            while (i < n && str.charAt(i) !== '.') {
                temp += str.charAt(i);
                i++;
            }
            
            ans = temp + '.' + ans;
        }
        
        return ans.substring(0, n).replace(/\.$/, ''); // remove trailing dot
    }
}