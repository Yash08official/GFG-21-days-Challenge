# Two Swaps

Given a permutation of some of the first natural numbers in an array arr[], determine if the array can be sorted in exactly two swaps. A swap can involve the same pair of indices twice.

Return true if it is possible to sort the array with exactly two swaps, otherwise return false.

Examples:

```bash
Input: arr = [4, 3, 2, 1]
Output: true
Explanation: First, swap arr[0] and arr[3]. The array becomes [1, 3, 2, 4]. Then, swap arr[1] and arr[2]. The array becomes [1, 2, 3, 4], which is sorted.
```

```bash
Input: arr = [4, 3, 1, 2]
Output: false
Explanation: It is not possible to sort the array with exactly two swaps.
```

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size()

### Solution

#### Java

```java
class Solution {
    public boolean checkSorted(List<Integer> arr) {
        int count=0, n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)!=i+1) count++;
        }
        //0 is valid
        //1 is impossible
        //2 is false
        //3 is valid
        //4 is sceptical
        return count==0 || count==3 || (count==4 && verify(arr));
    }
    boolean verify(List<Integer> arr){
        int a=-1, b=-1, c=-1, d=-1, n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)!=i+1){
                if(a==-1)   a=i;
                else if(b==-1)  b=i;
                else if(c==-1)  c=i;
                else    d=i;
            }
        }
        return verifySwap(arr,a,b) || verifySwap(arr,a,c) || verifySwap(arr,a,d);
    }
    boolean verifySwap(List<Integer> list,int i,int j){
        return list.get(i)==j+1 && list.get(j)==i+1;
    }
}
```
