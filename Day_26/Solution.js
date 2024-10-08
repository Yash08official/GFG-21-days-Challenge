class Solution {
    /**
     * @param {number[]} arr - Array of numbers
     * @returns {number} - Sum of the two largest numbers
     */
    pairsum(arr) {
        // Initialize two variables to store the maximum and second maximum values
        let max = 0, sm = 0;
        
        // Iterate through each element in the array
        for (let i of arr) {
            // If the current element is greater than the current max
            if (i > max) {
                // Update sm (second max) to be the old max, then update max
                sm = max;
                max = i;
            } 
            // If the current element is greater than sm but not greater than max
            else if (i > sm) {
                // Update sm to the current element
                sm = i;
            }
        }

        // Return the sum of max and sm (largest and second largest numbers)
        return max + sm;
    }
}
