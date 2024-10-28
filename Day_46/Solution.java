class Solution {
    // Method to remove duplicates from the array and return the result in an ArrayList
    ArrayList<Integer> removeDuplicate(int arr[]) {
        
        // Initialize an ArrayList to store the result without duplicates
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Boolean array to keep track of visited elements
        // Assuming the array contains elements in the range 0 to 100
        boolean vis[] = new boolean[101];
        
        // Iterate through each element in the input array
        for (int i : arr) {
            // Check if the element has not been visited before
            if (!vis[i]) {
                // If not visited, add it to the result list
                ans.add(i);
                
                // Mark this element as visited to avoid adding it again
                vis[i] = true;
            }
        }
        
        // Return the result list containing unique elements
        return ans;
    }
}