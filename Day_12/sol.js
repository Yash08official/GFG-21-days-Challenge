/**
 * @param {number[]} arr
 * @returns {number[]}
 */

class Solution {
    // Function to find two repeating elements in an array of size n.
    findTwoElement(arr) {
        let xor = 0, a = 0, b = 0, n = arr.length;
        
        // Calculate the XOR of all elements in the array and numbers from 1 to n
        for(let i = 0; i < n; i++){
            xor = xor ^ arr[i];
            xor = xor ^ (i + 1);
        }
        
        // Find the least significant bit (LSB) that is set in xor
        let lsb = xor & ~(xor - 1);
        
        // Divide the elements into two groups based on the LSB
        for(let i of arr){
            if((i & lsb) > 0) a ^= i;
            else b ^= i;
        }
        for(let i = 1; i <= n; i++){
            if((i & lsb) > 0) a ^= i;
            else b ^= i;
        }
        
        // Find the two repeating elements
        for(let i of arr){
            if(a === i) return [a, b];
            else if(b === i) return [b, a];
        }
        return [-1, -1];
    }
}