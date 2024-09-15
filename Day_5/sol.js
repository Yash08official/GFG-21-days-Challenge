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