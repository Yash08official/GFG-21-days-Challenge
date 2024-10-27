# Triplet Family

Given an array arr of integers. Find whether three numbers are such that the sum of two elements equals the third element.

Example:

```bash
Input: arr[] = [1, 2, 3, 4, 5]
Output: true
Explanation: The pair (1, 2) sums to 3.
```

```bash
Input: arr[] = [5, 3, 4]
Output: false
Explanation: No triplets satisfy the condition.
```

Expected Time Complexity: O(n2)
Expected Auxilary Space: O(1)

Constraints:
1 <= arr.size() <= 103
0 <= arr[i] <= 105

### Solution

#### Java

```java
class Solution {
    public boolean findTriplet(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        int n = arr.length;

        // Iterate over the array from the last element to the second element
        for (int i = n - 1; i >= 2; --i) {
            int j = 0;        // Left pointer
            int k = i - 1;    // Right pointer

            // Use two pointers to find if arr[j] + arr[k] equals arr[i]
            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    return true; // Triplet found
                } else if (arr[j] + arr[k] < arr[i]) {
                    ++j; // Move left pointer to increase the sum
                } else {
                    --k; // Move right pointer to decrease the sum
                }
            }
        }

        return false; // No triplet found
    }
}
```
