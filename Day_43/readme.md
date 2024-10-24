# Alternative Sorting

Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and the fourth element is the second smallest, and so on.

Examples:

```bash
Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
Output: [7, 1, 6, 2, 5, 3, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
```

```bash
Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2]
Output: [9, 1, 8, 2, 7, 3, 6, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
```

Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(n).

Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

### Solution

#### Java

```java
class Solution {
    // Method to sort the array in alternating high-low order
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Sort the input array in ascending order
        Arrays.sort(arr);

        // Initialize an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Define two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = arr.length - 1;

        // Loop until the two pointers cross each other
        while (left <= right) {

            // Add the largest element from the right side (descending order)
            if (right > left) {
                result.add(arr[right--]);  // Decrement the 'right' pointer
            }

            // Add the smallest element from the left side (ascending order)
            if (left <= right) {
                result.add(arr[left++]);  // Increment the 'left' pointer
            }
        }

        // Return the ArrayList containing the alternately sorted array
        return result;
    }
}
```
