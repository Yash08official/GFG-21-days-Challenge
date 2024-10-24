class Solution {
    // Method to sort the array in alternating high-low order
    public static ArrayList<Integer> alternateSort(int[] arr) {
        
        // Sort the input array in ascending order
        Arrays.sort(arr);
        
        // Initialize an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();
        
        // Define two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = arr.length - 1;
        
        // Loop until the two pointers cross each other
        while (left <= right) {
            
            // Add the largest element from the right side (descending order)
            if (right > left) {
                result.add(arr[right--]);  // Decrement the 'right' pointer
            }
            
            // Add the smallest element from the left side (ascending order)
            if (left <= right) {
                result.add(arr[left++]);  // Increment the 'left' pointer
            }
        }
        
        // Return the ArrayList containing the alternately sorted array
        return result;
    }
}