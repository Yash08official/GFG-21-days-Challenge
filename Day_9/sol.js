/**
 * @param {number[]} height
 * @returns {number}
 */

class Solution {
    // Returns count buildings that can see sunlight
    countBuildings(height) {
        let prev = -1, ans = 0;
        for(let i of height){
            if(i > prev){
                ans++;
                prev = i;
            }
        }
        return ans;
    }
}
