# Longest valid Parentheses

Given a string str consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

A parenthesis string is valid if:

    For every opening parenthesis, there is a closing parenthesis.
    Opening parenthesis must be closed in the correct order.

Examples :

```
Input: str = ((()
Output: 2
Explaination: The longest valid parenthesis substring is "()".
```

```
Input: str = )()())
Output: 4
Explaination: The longest valid parenthesis substring is "()()".
```

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |str| ≤ 105

## Solution :

### Java

```
class Solution {
    static int maxLength(String S) {
        int open = 0, close = 0, res = 0;
        for(int i = 0; i < S.length(); i++){
            if (S.charAt(i) == '(') open ++;
            else close++;
            if(open == close) res = Math.max(res, open + close);
            else if (close > open) open = 0; close = 0;
        }

        open = 0; close = 0;
        for(int i = S.length() - 1; i >= 0; i--){
            if  (S.charAt(i) == '(') open++;
            else close++;
            if(open == close) res = Math.max(res, open + close);
            else if(close < open) open = 0; close = 0;
        }
        return res;
    }
}
```

### JavaScript

```
/**
 * @param {string} str
 * @returns {number}
 */

class Solution {
    maxLength(str) {
        let open = 0, close = 0, res = 0;
        for(let i = 0; i < str.length; i++){
            if (str[i] === '(') open ++;
            else close++;
            if(open === close) res = Math.max(res, open + close);
            else if (close > open) open = 0, close = 0;
        }

        open = 0, close = 0;
        for(let i = str.length - 1; i >= 0; i--){
            if  (str[i] === '(') open++;
            else close++;
            if(open === close) res = Math.max(res, open + close);
            else if(close < open) open = 0, close = 0;
        }
        return res;
    }
}
```
