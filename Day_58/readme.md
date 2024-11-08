# Minimum repeat to make substring

Given two strings s1 and s2. Return a minimum number of times s1 has to be repeated such that s2 is a substring of it. If s2 can never be a substring then return -1.

Note: Both the strings contain only lowercase letters.

**Examples:**

```bash
Input: s1 = "ww", s2 = "www"
Output: 2
Explanation: Repeating s1 two times (wwww), s2 is a substring of it.
```

```bash
Input: s1 = "abcd", s2 = "cdabcdab"
Output: 3
Explanation: Repeating s1 three times (abcdabcdabcd), s2 is a substring of it. s2 is not a substring of s2 when it is repeated less than 3 times.
```

```bash
Input: s1 = "ab", s2 = "cab"
Output: -1
Explanation: No matter how many times we repeat s1, we can't get a string such that s2 is a substring of it.
```

**Constraints:**
1 ≤ |s1|, |s2| ≤ 105

### Solution

#### Java

```java
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
```
