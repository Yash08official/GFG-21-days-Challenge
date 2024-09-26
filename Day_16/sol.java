class Solution {
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Get the length of the input array
        int n = arr.length;
        
        // Initialize an empty ArrayList to store the maximum elements of subarrays
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Initialize a Deque (double-ended queue) to store indices of elements in the array
        Deque<Integer> dq = new ArrayDeque<>();
        
        // Process the first 'k' elements of the array
        for(int i=0; i<k; i++){
            // Remove elements from the back of the deque that are smaller than the current element
            while(!dq.isEmpty() && arr[ dq.peekLast() ] <= arr[i]){
                dq.removeLast();
            }
            
            // Add the current element to the back of the deque
            dq.addLast(i);
        }
        
        // Add the maximum element of the first subarray to the result list
        ans.add(arr[ dq.peekFirst() ]);
        
        // Process the remaining elements of the array
        for(int i=k; i<n; i++){
            // Remove elements from the front of the deque that are out of the current window
            if(dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            
            // Remove elements from the back of the deque that are smaller than the current element
            while(!dq.isEmpty() && arr[ dq.peekLast() ] <= arr[i]){
                dq.removeLast();
            }
            
            // Add the current element to the back of the deque
            dq.addLast(i);
            
            // Add the maximum element of the current subarray to the result list
            ans.add(arr[ dq.peekFirst() ]);
        }
        
        // Return the result list
        return ans;
    }
}