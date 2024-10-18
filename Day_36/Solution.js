class Solution {
    getSingle(arr) {
        // Variable to store the XOR result of all elements
        let xor = 0;
        
        // Traverse through the array and apply XOR to each element
        for (let n of arr) {
            xor ^= n;  // XOR the current element with the result
        }
        
        // The result will be the number that appears only once
        return xor;
    }
}
