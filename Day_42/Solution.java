class Solution {
    // This method modifies the array and returns a new rearranged ArrayList of integers
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;  // Get the size of the input array
        ArrayList<Integer> ans = new ArrayList<>();  // Create an empty ArrayList to store the result
        
        // First pass: Combine adjacent duplicates and add modified values to 'ans'
        for(int i = 0; i < n; i++) {
            // If current element is the same as the next one
            if (i + 1 < n && arr[i] == arr[i + 1]) {
                ans.add(arr[i] * 2);  // Double the current element
                ans.add(0);           // Add 0 in place of the combined element
                i++;                  // Skip the next element since it's already processed
            } else {
                ans.add(arr[i]);       // Add the element as is if no duplicate is found
            }
        }

        // Second pass: Move all non-zero elements to the front and shift zeros to the end
        int i = 0, j = 0;
        while (j < n) {
            // Move 'i' to the first zero element in the list
            while (i < n && ans.get(i) != 0) i++;
            j = Math.max(j, i);  // Ensure 'j' starts from at least the position of 'i'
            
            // Move 'j' to the next non-zero element
            while (j < n && ans.get(j) == 0) j++;
            
            // If either 'i' or 'j' has reached the end, stop the process
            if (i == n || j == n) break;
            
            // Swap the zero at position 'i' with the non-zero element at position 'j'
            ans.set(i, ans.get(j));
            ans.set(j, 0);  // Set the original position 'j' to 0
        }
        
        // Return the modified ArrayList
        return ans;
    }
}
