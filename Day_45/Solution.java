class Solution {
    public boolean findTriplet(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        int n = arr.length;
        
        // Iterate over the array from the last element to the second element
        for (int i = n - 1; i >= 2; --i) {
            int j = 0;        // Left pointer
            int k = i - 1;    // Right pointer
            
            // Use two pointers to find if arr[j] + arr[k] equals arr[i]
            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    return true; // Triplet found
                } else if (arr[j] + arr[k] < arr[i]) {
                    ++j; // Move left pointer to increase the sum
                } else {
                    --k; // Move right pointer to decrease the sum
                }
            }
        }
        
        return false; // No triplet found
    }
}