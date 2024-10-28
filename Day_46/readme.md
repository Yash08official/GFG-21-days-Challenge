# Remove duplicates in array

Given an array arr consisting of positive integers numbers, remove all duplicates numbers.

Example:

```bash
Input: arr[] = [2, 2, 3, 3, 7, 5]
Output: [2, 3, 7, 5]
Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.
```

```bash
Input: arr[] = [2, 2, 5, 5, 7, 7]
Output: [2, 5, 7]
Explanation: After removing the duplicates 2, 5 and 7 we get 2 5 7.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<= arr.size() <=106
2<=arr[i]<=100

### Solution

#### Java

```java
class Solution {
    // Method to remove duplicates from the array and return the result in an ArrayList
    ArrayList<Integer> removeDuplicate(int arr[]) {

        // Initialize an ArrayList to store the result without duplicates
        ArrayList<Integer> ans = new ArrayList<>();

        // Boolean array to keep track of visited elements
        // Assuming the array contains elements in the range 0 to 100
        boolean vis[] = new boolean[101];

        // Iterate through each element in the input array
        for (int i : arr) {
            // Check if the element has not been visited before
            if (!vis[i]) {
                // If not visited, add it to the result list
                ans.add(i);

                // Mark this element as visited to avoid adding it again
                vis[i] = true;
            }
        }

        // Return the result list containing unique elements
        return ans;
    }
}
```
