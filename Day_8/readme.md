# Reverse Words

Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'.

Examples :

```
Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
```

```
Input: str = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole string , the input string becomes mno.pqr
```

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 <= |str| <= 105

## Solution

### Java

```java

class Solution {
    String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length(), i=0;
        while(i<n){
            char c = s.charAt(i);

            if(c=='.'){
                i++;
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while(i<n && s.charAt(i)!='.'){
                temp.append(s.charAt(i));
                i++;
            }

            ans.insert(0,temp+".");
        }

        return ans.toString().substring(0,n);
    }
}
```

### JavaScript

```js
/**
 * @param {string} str
 * @returns {string}
 */

class Solution {
  // Function to reverse words in a given string.
  reverseWords(str) {
    let ans = "";
    let n = str.length,
      i = 0;
    while (i < n) {
      let c = str.charAt(i);

      if (c === ".") {
        i++;
        continue;
      }

      let temp = "";
      while (i < n && str.charAt(i) !== ".") {
        temp += str.charAt(i);
        i++;
      }

      ans = temp + "." + ans;
    }

    return ans.substring(0, n).replace(/\.$/, ""); // remove trailing dot
  }
}
```
