class Solution {
    int getSingle(int arr[]) {
        // code here
        
        // Variable to store the XOR result of all elements
        int xor = 0;
        
        // Traverse through the array and apply XOR to each element
        for (int n : arr) {
            xor ^= n;  // XOR the current element with the result
        }
        
        // The result will be the number that appears only once
        return xor;
    }
}
