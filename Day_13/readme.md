# Smallest window in a string containing all the characters of another string

Given two strings s and p. Find the smallest window in the string s consisting of all the characters(including duplicates) of the string p. Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index.

Note : All characters are in Lowercase alphabets.

Examples:

```
Input: s = "timetopractice", p = "toc"
Output: toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.
```

```
Input: s = "zoomlazapzo", p = "oza"
Output: apzo
Explanation: "apzo" is the smallest
substring in which "oza" can be found.
```

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(n), n = len(p)

Constraints:
1 ≤ |s|, |p| ≤ 105

## Solution

### Java

```java
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
```

### JavaScript

```js
/**
 * @param {string} s
 * @param {string} p
 * @returns {string}
 */
class Solution {
  //Function to find the smallest window in the string s consisting
  //of all the characters of string p.
  smallestWindow(s, p) {
    // Initialize arrays to store the frequency of characters in p and s
    let pa = new Array(26).fill(0),
      sa = new Array(26).fill(0);

    // Store the length of p and s
    let pn = p.length,
      sn = s.length;

    // Initialize a variable to keep track of the number of characters in p that are found in the current window
    let find = 0;

    // Count the frequency of each character in p
    for (let i = 0; i < pn; i++) {
      pa[p.charCodeAt(i) - "a".charCodeAt(0)]++;
    }

    // Initialize two pointers, i and j, to represent the start and end of the window
    let i = 0,
      j = 0;

    // Initialize a variable to store the smallest window found so far
    let ans = "";

    // Iterate through the string s
    while (j < sn) {
      // Get the character at the current position j
      let c = s.charCodeAt(j) - "a".charCodeAt(0);

      // Increment the frequency of the character in the window
      sa[c]++;

      // If the frequency of the character in the window is less than or equal to the frequency in p, increment find
      if (sa[c] <= pa[c]) find++;

      // While the window contains all characters of p
      while (find === pn) {
        // If the current window is smaller than the smallest window found so far, update ans
        if (ans === "" || j - i + 1 < ans.length) {
          ans = s.substring(i, j + 1);
        }

        // Get the character at the start of the window
        c = s.charCodeAt(i) - "a".charCodeAt(0);

        // Decrement the frequency of the character in the window
        sa[c]--;

        // If the frequency of the character in the window is less than the frequency in p, decrement find
        if (sa[c] < pa[c]) find--;

        // Move the start of the window to the right
        i++;
      }
      // Move the end of the window to the right
      j++;
    }

    // Return the smallest window found, or "-1" if no window is found
    return ans === "" ? "-1" : ans;
  }
}
```
