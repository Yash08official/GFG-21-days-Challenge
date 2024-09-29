
import java.lang.Math;
/*
 * This class provides a solution to the "Total Count" problem.
 * The problem requires us to compute the total number of small integers that can be obtained by dividing each element in the given array into the minimum number of integers less than or equal to a threshold value k.
 */

class Solution {
    int totalCount(int k, int[] arr) {
        // Initialize a variable to store the total count of small integers.
        int totalCount = 0;
         // Iterate through each element in the array
        for (int num : arr) {
             // Calculate the number of small integers required using ceiling division.
            // We use Math.ceil to round up to the nearest integer, because we can't have a fraction of an integer.
            int count = (int) Math.ceil((double) num / k);
            // Add the calculated count to the total count.
            totalCount += count;
        }
        // Return the total count of small integers.
        return totalCount;
    }
     /*
     * This is the main method that demonstrates the usage of the totalCount method.
     * 
     * @param args Command-line arguments (not used in this example).
     */

    public static void main(String[] args) {
        // Create an instance of the Solution class.
        Solution solution = new Solution();
        // Define the input array and threshold value.
        int[] arr = {5, 8, 10, 13};
        int k = 3;
        // Call the totalCount method and store the result.
        int result = solution.totalCount(k, arr);
        // Print the result.
        System.out.println(result);  // Output: 14
    }
}
