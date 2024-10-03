# Majority Vote

You are given an array of integer nums[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return -1.

Note: The answer should be returned in an increasing format.

Examples:

```
Input: nums = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
```

```
Input: nums = [1, 2, 3, 4, 5]
Output: [-1]
Explanation: no candidate occur more than n/3 times.
```

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraint:
1 <= nums.size() <= 106
0 <= nums[i] <= 109

## Solution

### Java

```java
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Initialize variables
        int max = Integer.MAX_VALUE; // Set max to the largest possible integer
        int a = max; // Candidate 1
        int b = a; // Candidate 2
        int c1 = 0; // Count for Candidate 1
        int c2 = 0; // Count for Candidate 2
        int n = nums.size(); // Total number of elements in the list

        // Step 1: Find potential candidates
        for (int i : nums) {
            // If the current number matches Candidate 1
            if (a == i) {
                c1++; // Increase count for Candidate 1
            // If the current number matches Candidate 2
            } else if (b == i) {
                c2++; // Increase count for Candidate 2
            // If Candidate 1's count is zero, assign the current number as Candidate 1
            } else if (c1 == 0) {
                a = i; // Set current number as Candidate 1
                c1 = 1; // Reset count for Candidate 1
            // If Candidate 2's count is zero, assign the current number as Candidate 2
            } else if (c2 == 0) {
                b = i; // Set current number as Candidate 2
                c2 = 1; // Reset count for Candidate 2
            // If current number doesn't match either candidate
            } else {
                c1--; // Decrease count for Candidate 1
                c2--; // Decrease count for Candidate 2
            }
        }

        // Step 2: Count how many times each candidate appears
        c1 = 0; // Reset count for Candidate 1
        c2 = 0; // Reset count for Candidate 2
        ArrayList<Integer> ans = new ArrayList<>(); // Create a list to store valid candidates

        // Loop through the original list to count occurrences of candidates
        for (int i : nums) {
            if (i == a) c1++; // Count Candidate 1
            else if (i == b) c2++; // Count Candidate 2
        }

        // Step 3: Check if candidates meet the condition (more than n/3)
        if (c1 > n / 3) ans.add(a); // If Candidate 1's count is greater than n/3, add to results
        if (c2 > n / 3) ans.add(b); // If Candidate 2's count is greater than n/3, add to results

        // If no candidates found, return -1 as a list; otherwise, return the list of candidates
        if (ans.size() == 0) return Arrays.asList(-1);
        return ans;
    }
}
```

### JavaScript

```js
class Solution {
  // Function to find the majority elements in the array
  findMajority(nums) {
    // Initialize variables
    const max = Number.MAX_VALUE; // Set max to the largest possible number
    let a = max; // Candidate 1
    let b = a; // Candidate 2
    let c1 = 0; // Count for Candidate 1
    let c2 = 0; // Count for Candidate 2
    const n = nums.length; // Total number of elements in the array

    // Step 1: Find potential candidates
    for (let i of nums) {
      // If the current number matches Candidate 1
      if (a === i) {
        c1++; // Increase count for Candidate 1
        // If the current number matches Candidate 2
      } else if (b === i) {
        c2++; // Increase count for Candidate 2
        // If Candidate 1's count is zero, assign the current number as Candidate 1
      } else if (c1 === 0) {
        a = i; // Set current number as Candidate 1
        c1 = 1; // Reset count for Candidate 1
        // If Candidate 2's count is zero, assign the current number as Candidate 2
      } else if (c2 === 0) {
        b = i; // Set current number as Candidate 2
        c2 = 1; // Reset count for Candidate 2
        // If current number doesn't match either candidate
      } else {
        c1--; // Decrease count for Candidate 1
        c2--; // Decrease count for Candidate 2
      }
    }

    // Step 2: Count how many times each candidate appears
    c1 = 0; // Reset count for Candidate 1
    c2 = 0; // Reset count for Candidate 2
    const ans = []; // Create an array to store valid candidates

    // Loop through the original array to count occurrences of candidates
    for (let i of nums) {
      if (i === a) c1++; // Count Candidate 1
      else if (i === b) c2++; // Count Candidate 2
    }

    // Step 3: Check if candidates meet the condition (more than n/3)
    if (c1 > n / 3) ans.push(a); // If Candidate 1's count is greater than n/3, add to results
    if (c2 > n / 3) ans.push(b); // If Candidate 2's count is greater than n/3, add to results

    // If no candidates found, return -1 as an array; otherwise, return the list of candidates
    return ans.length === 0 ? [-1] : ans;
  }
}

// Example usage
const solution = new Solution();
const nums = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6];
console.log(solution.findMajority(nums)); // Output: [5, 6]
```
