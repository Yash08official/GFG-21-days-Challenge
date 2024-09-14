# Alternate positive and negative numbers

Given an unsorted array arr containing both positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.

Examples:

```
Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
Output: 9 -2 4 -1 5 -5 0 -3 2
Explanation: Positive elements : [9,4,5,0,2]
Negative elements : [-2,-1,-5,-3]
As we need to maintain the relative order of postive elements and negative elements we will pick each element from the positive and negative and will store them. If any of the positive and negative numbersare completed. we will continue with the remaining signed elements.
The output is 9,-2,4,-1,5,-5,0,-3,2.
```

```
Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
Output: 5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : [5,2,4,7,1,8,0]
Negative elements : [-5,-2,-8]
The output is 5, -5, 2, -2, 4, -8, 7, 1, 8, 0.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ arr.size() ≤ 107
-106 ≤ arr[i] ≤ 107

## Solution : JavaScript

```javascript
class Solution {
  rearrange(arr) {
    let pos = [];
    let neg = [];
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        neg.push(arr[i]);
      } else {
        pos.push(arr[i]);
      }
    }
    let k = 0;
    let l = 0;
    for (let i = 0; i < arr.length; i++) {
      if (i % 2 === 0 && k < pos.length) {
        arr[i] = pos[k++];
      } else if (i % 2 !== 0 && l < neg.length) {
        arr[i] = neg[l++];
      } else if (k === pos.length && l < neg.length) {
        arr[i] = neg[l++];
      } else {
        arr[i] = pos[k++];
      }
    }
  }
}
```
## Solution : Java

```java

public class Solution {
  public void rearrange(int[] arr) {
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        neg.add(arr[i]);
      } else {
        pos.add(arr[i]);
      }
    }
    int k = 0;
    int l = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0 && k < pos.size()) {
        arr[i] = pos.get(k++);
      } else if (i % 2 != 0 && l < neg.size()) {
        arr[i] = neg.get(l++);
      } else if (k == pos.size() && l < neg.size()) {
        arr[i] = neg.get(l++);
      } else {
        arr[i] = pos.get(k++);
      }
    }
  }
}

```
