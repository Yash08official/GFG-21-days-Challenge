# Single Number

Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times.

```bash
Input: arr[] = [1, 1, 2, 2, 2]
Output: 2
Explanation: In the given array all element appear two times except 2 which appears thrice.
```

```bash
Input: arr[] = [8, 8, 7, 7, 6, 6, 1]
Output: 1
Explanation: In the given array all element appear two times except 1 which appears once
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arri ≤ 105

### Solution

#### Java

```java
class Solution {
    int getSingle(int arr[]) {
        // code here

        // Variable to store the XOR result of all elements
        int xor = 0;

        // Traverse through the array and apply XOR to each element
        for (int n : arr) {
            xor ^= n;  // XOR the current element with the result
        }

        // The result will be the number that appears only once
        return xor;
    }
}
```

#### JavaScript

```js
class Solution {
  getSingle(arr) {
    // Variable to store the XOR result of all elements
    let xor = 0;

    // Traverse through the array and apply XOR to each element
    for (let n of arr) {
      xor ^= n; // XOR the current element with the result
    }

    // The result will be the number that appears only once
    return xor;
  }
}
```
