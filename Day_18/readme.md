# Total count

You are given an array arr[] of positive integers and a threshold value k. For each element in the array, divide it into the minimum number of small integers such that each divided integer is less than or equal to k. Compute the total number of these integer across all elements of the array.

### Examples:

```bash
Input: k = 3, arr[] = [5, 8, 10, 13]
Output: 14
Explanation: Each number can be expressed as sum of different numbers less than or equal to k as 5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1), 13 (3 + 3 + 3 + 3 + 1). So, the sum of count of each element is (2+3+4+5)=14.
```

```bash
Input: k = 4, arr[] = [10, 2, 3, 4, 7]
Output: 8
Explanation: Each number can be expressed as sum of different numbers less than or equal to k as 10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3).So, the sum of count of each element is (3 + 1 + 1 + 1 + 2) = 8.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
1 ≤ k ≤ 105

### Solution

#### Java

```java

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
```

#### JavaScript

```js
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
```
