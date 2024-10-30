# Pairs with difference k

Given an array arr[] of positive integers. Find the number of pairs of integers whose difference equals a given number k.
Note: (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered different.

**Examples:**

```bash
Input: arr[] = [1, 5, 3, 4, 2], k = 3
Output: 2
Explanation: There are 2 pairs with difference 3,the pairs are {1, 4} and {5, 2}
```

```bash
Input: arr[] = [8, 12, 16, 4, 0, 20], k = 4
Output: 5
Explanation: There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20}.
```

**Constraints:**
1 <= arr.size() <= 106
1 <= k <= 106
1 <= arri <= 106

### Solution

#### Java

```java
class Solution {
    // Method to count pairs with a given difference `k` in the array `arr`
    public int countPairsWithDiffK(int[] arr, int k) {
        // Declare a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0; // Initialize the answer to store the count of valid pairs

        // Traverse each element in the array
        for (int i : arr) {
            // Add the count of occurrences where (element + k) or (element - k) exists
            ans += map.getOrDefault(i + k, 0); // Check for pairs where difference with `i` is `+k`
            ans += map.getOrDefault(i - k, 0); // Check for pairs where difference with `i` is `-k`

            // Increment the frequency of the current element in the map
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Return the total count of valid pairs
        return ans;
    }
}
```
