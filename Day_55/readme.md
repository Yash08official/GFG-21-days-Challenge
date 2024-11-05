# Rotate by 90 degree

Given a square mat[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space.

**Examples:**

```bash
Input: mat[][] = [[1 2 3], [4 5 6], [7 8 9]]
Output:
7 4 1
8 5 2
9 6 3
```

```bash
Input: mat[][] = [1 2], [3 4]
Output:
3 1
4 2
```

```bash
Input: mat[][] = [[1]]
Output:
1
```

Constraints:
1 ≤ mat.size() ≤ 1000
1 <= mat[][] <= 100

### Solution

#### Java

```java
class GFG
{
    static void rotate(int matrix[][])
    {
        int n=matrix.length;
        int l=0, r=n-1;

        //rotation (inside sq.)
        for(int op=0;op<n/2;op++){

            for(int i=l;i<r;i++){

                int top_left=matrix[l][i];
                int top_right=matrix[i][r];
                int bottom_left=matrix[n-1-i][l];
                int bottom_right=matrix[n-1-l][n-1-i];

                matrix[l][i]=bottom_left;
                matrix[i][r]=top_left;
                matrix[n-1-l][n-1-i]=top_right;
                matrix[n-1-i][l]=bottom_right;

            }

            l++;
            r--;

        }
    }
}
```
