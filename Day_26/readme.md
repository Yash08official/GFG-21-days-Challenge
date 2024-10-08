# Largest Pair Sum

Find the largest pair sum in an array of distinct integers.

Examples :

```bash
Input: arr[] = [12, 34, 10, 6, 40]
Output: 74
Explanation: Sum of 34 and 40 is the largest, i.e, 34 + 40 = 74.
```

```bash
Input: arr[] = [10, 20, 30]
Output: 50
Explanation: 20 + 30 = 50.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106

## Solution

### Java

```java
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
```

### JavaScript

```js
class Solution {
  /**
   * @param {number[]} arr - Array of numbers
   * @returns {number} - Sum of the two largest numbers
   */
  pairsum(arr) {
    // Initialize two variables to store the maximum and second maximum values
    let max = 0,
      sm = 0;

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
```
