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