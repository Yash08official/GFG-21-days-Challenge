class Solution {
    static int sameOccurrence(int arr[], int x, int y) {
        // Create a HashMap to store the difference (fa - fb) as the key and the count of such differences as the value.
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  // Initialize the map with the difference of 0 occurring once.
        
        int fa = 0, fb = 0, ans = 0;  // fa: count of x, fb: count of y, ans: stores the result
        
        // Iterate over each element in the array
        for(int i : arr) {
            // If the element is equal to x, increase fa (count of x)
            if(i == x)    
                fa++;
            // If the element is equal to y, increase fb (count of y)
            else if(i == y)   
                fb++;
            
            // Check how many times the current difference (fa - fb) has been seen before
            // and add the count to the result (ans).
            ans += map.getOrDefault(fa - fb, 0);
            
            // Update the map by adding 1 to the count of this difference (fa - fb)
            map.merge(fa - fb, 1, Integer::sum);  // Integer::sum will handle adding 1 to the existing value.
        }
        
        return ans;  // Return the final answer
    }
}
