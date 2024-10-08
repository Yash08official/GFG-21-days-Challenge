class Solution {
    // Method to find the sum of the two largest numbers in an array
    public static int pairsum(int[] arr) {
        // Two variables to store the maximum and second maximum values
        int max = 0, sm = 0;
        
        // For loop to iterate over each element in the array
        for(int i : arr){
            // Check if the current element is greater than the current max
            if(i > max){
                // If it is, assign the current max to sm (second max) and update max
                sm = max;
                max = i;
            }
            // If the current element isn't greater than max but is greater than sm
            else if (i > sm){
                // Update sm to the current element
                sm = i;
            }
        }
        
        // Return the sum of max and sm (largest and second largest numbers)
        return max + sm;
    }
}
