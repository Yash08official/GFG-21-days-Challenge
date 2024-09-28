# Minimal Cost

There is an array arr of heights of stone and Geek is standing at the first stone and can jump to one of the following: Stone i+1, i+2, ... i+k stone, where k is the maximum number of steps that can be jumped and cost will be |hi-hj| is incurred, where j is the stone to land on. Find the minimum possible total cost incurred before the Geek reaches the last stone.

### Example:

```bash
Input: k = 3, arr[]= [10, 30, 40, 50, 20]
Output: 30
Explanation: Geek will follow the path 1->2->5, the total cost would be | 10-30| + |30-20| = 30, which is minimum
```

```bash
Input: k = 1, arr[]= [10, 20, 10]
Output: 20
Explanation: Geek will follow the path 1->2->3, the total cost would be |10 - 20| + |20 - 10| = 20.
```

Expected Time Complexity: O(n\*k)
Expected Auxilary Space: O(n)

Constraint:
1<= arr.size() <=104
1 <= k <= 100
1 <= arr[i] <= 104

### Solution

#### Java

```java
class Solution {
    public int minimizeCost(int k, int arr[]) {
        // Get the length of the array
        int n = arr.length;

        // Initialize a dynamic programming array with Integer.MAX_VALUE values
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // The cost to reach the first stone is 0
        dp[0] = 0;

        // Iterate over each stone from the second stone to the last stone
        for (int i = 1; i < n; i++) {
            // Iterate over all possible previous stones that are within k steps
            for (int j = Math.max(0, i - k); j < i; j++) {
                // Calculate the minimum cost to reach the current stone
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }

        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}
```

#### JavaScript

```js
class Solution {
  // Function to minimize the cost of reducing the heights.
  minimizeCost(k, arr) {
    // Get the length of the array
    let n = arr.length;

    // Initialize a dynamic programming array with Infinity values
    let dp = new Array(n).fill(Infinity);

    // The cost to reach the first stone is 0
    dp[0] = 0;

    // Iterate over each stone from the second stone to the last stone
    for (let i = 1; i < n; i++) {
      // Iterate over all possible previous stones that are within k steps
      for (let j = Math.max(0, i - k); j < i; j++) {
        // Calculate the minimum cost to reach the current stone
        dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
      }
    }

    // Return the minimum cost to reach the last stone
    return dp[n - 1];
  }
}
```
