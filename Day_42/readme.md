# Modify the Array

Given an array arr. Return the modified array in such a way that if the current and next numbers are valid numbers and are equal then double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0's are shifted to the end.

Note:

Assume ‘0’ as the invalid number and all others as a valid number.
The sequence of the valid numbers is present in the same order.
Example:

```bash
Input: arr[] = [2, 2, 0, 4, 0, 8]
Output: [4, 4, 8, 0, 0, 0]
Explanation: At index 0 and 1 both the elements are the same. So, we will change the element at index 0 to 4 and the element at index 1 is 0 then we will shift all the zeros to the end of the array. So, the array will become [4, 4, 8, 0, 0, 0].
```

```bash
Input: arr[] = [0, 2, 2, 2, 0, 6, 6, 0, 0, 8]
Output: [4, 2, 12, 8, 0, 0, 0, 0, 0, 0]
Explanation: At index 5 and 6 both the elements are the same. So, we will change the element at index 5 to 12 and the element at index 6 is 0. We will change the element at index 1 to 4 and the element at index 2 is 0. Then we shift all the zeros to the end of the array. So, array will become [4, 2, 12, 8, 0, 0, 0, 0, 0, 0].
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

### Solution

#### Java

```java
class Solution {
    // This method modifies the array and returns a new rearranged ArrayList of integers
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;  // Get the size of the input array
        ArrayList<Integer> ans = new ArrayList<>();  // Create an empty ArrayList to store the result

        // First pass: Combine adjacent duplicates and add modified values to 'ans'
        for(int i = 0; i < n; i++) {
            // If current element is the same as the next one
            if (i + 1 < n && arr[i] == arr[i + 1]) {
                ans.add(arr[i] * 2);  // Double the current element
                ans.add(0);           // Add 0 in place of the combined element
                i++;                  // Skip the next element since it's already processed
            } else {
                ans.add(arr[i]);       // Add the element as is if no duplicate is found
            }
        }

        // Second pass: Move all non-zero elements to the front and shift zeros to the end
        int i = 0, j = 0;
        while (j < n) {
            // Move 'i' to the first zero element in the list
            while (i < n && ans.get(i) != 0) i++;
            j = Math.max(j, i);  // Ensure 'j' starts from at least the position of 'i'

            // Move 'j' to the next non-zero element
            while (j < n && ans.get(j) == 0) j++;

            // If either 'i' or 'j' has reached the end, stop the process
            if (i == n || j == n) break;

            // Swap the zero at position 'i' with the non-zero element at position 'j'
            ans.set(i, ans.get(j));
            ans.set(j, 0);  // Set the original position 'j' to 0
        }

        // Return the modified ArrayList
        return ans;
    }
}
```
