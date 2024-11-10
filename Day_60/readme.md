# Union of Two Sorted Arrays with Distinct Elements

Given two sorted arrays a[] and b[], where each array contains distinct elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
**Examples:**

```bash
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
```

```bash
Input: a[] = [2, 3, 4, 5], b[] = [1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
```

```bash
Input: a[] = [1], b[] = [2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
```

**Constraints:**
1 <= a.size(), b.size() <= 105
-109 <= a[i] , b[i] <= 109

### Solution

#### Java

```java
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int i=0, j=0, n=a.length, m=b.length;
        while(i<n && j<m){
            if(a[i]==b[j]){
                al.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                al.add(a[i++]);
            }else{
                al.add(b[j++]);
            }
        }

        while(i<n)  al.add(a[i++]);
        while(j<m)  al.add(b[j++]);

        return al;
    }
}
```
