/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */

class Solution {

    totalCount(k, arr) {
        // Initialize a variable to store the total count of small integers.
        let totalCount = 0;
        
        // Iterate through each element in the array.
        for (let num of arr) {
            // Calculate the number of small integers required using ceiling division.
            // We use Math.ceil to round up to the nearest integer, because we can't have a fraction of an integer.
            let count = Math.ceil(num / k);
            
            // Add the calculated count to the total count.
            totalCount += count;
        }
        
        // Return the total count of small integers.
        return totalCount;
    }
}