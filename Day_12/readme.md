# Missing And Repeating

Given an unsorted array arr of of positive integers. One number 'A' from set {1, 2,....,n} is missing and one number 'B' occurs twice in array. Find numbers A and B.

Examples

```
Input: arr[] = [2, 2]
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.
```

```
Input: arr[] = [1, 3, 3]
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number is 2.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ n ≤ 105
1 ≤ arr[i] ≤ n

## Solution

### Java

```java
class Solve {
    int[] findTwoElement(int arr[]) {
        int xor=0, a=0, b=0, n=arr.length;

        for(int i=0;i<n;i++){
            xor = xor^arr[i];
            xor = xor^(i+1);
        }

        int lsb = (xor & ~(xor-1));

        for(int i:arr){
            if( (i&lsb) >0) a^=i;
            else    b^=i;
        }
        for(int i=1;i<=n;i++){
            if( (i&lsb) >0) a^=i;
            else    b^=i;
        }
        for(int i:arr){
            if(a==i)    return new int[]{a,b};
            else if(b==i)   return new int[]{b,a};
        }
        return new int[]{-1,-1};
    }
}
```

### JavaScript

```js
/**
 * @param {number[]} arr
 * @returns {number[]}
 */

class Solution {
  // Function to find two repeating elements in an array of size n.
  findTwoElement(arr) {
    let xor = 0,
      a = 0,
      b = 0,
      n = arr.length;

    // Calculate the XOR of all elements in the array and numbers from 1 to n
    for (let i = 0; i < n; i++) {
      xor = xor ^ arr[i];
      xor = xor ^ (i + 1);
    }

    // Find the least significant bit (LSB) that is set in xor
    let lsb = xor & ~(xor - 1);

    // Divide the elements into two groups based on the LSB
    for (let i of arr) {
      if ((i & lsb) > 0) a ^= i;
      else b ^= i;
    }
    for (let i = 1; i <= n; i++) {
      if ((i & lsb) > 0) a ^= i;
      else b ^= i;
    }

    // Find the two repeating elements
    for (let i of arr) {
      if (a === i) return [a, b];
      else if (b === i) return [b, a];
    }
    return [-1, -1];
  }
}
```
