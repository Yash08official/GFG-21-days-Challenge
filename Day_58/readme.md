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

        for(int i = 0; i < s2.length(); i++){
            if(!s1.contains(String.valueOf(s2.charAt(i)))){
                return -1;
            }
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();

        while(sb.length()<s2.length()){
            count++;
            sb.append(s1);
        }
        if(sb.toString().contains(s2)){
            return count;
        }
        sb.append(s1);
        count++;
        if(sb.toString().contains(s2)){
            return count;
        }
        return -1;
    }
};
```
