# K Sized Subarray Maximum

Given an array arr[] and an integer k. Find the maximum for each and every contiguous subarray of size k.

Examples:

```bash
Input: k = 3, arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6]
Output: [3, 3, 4, 5, 5, 5, 6]
Explanation:
1st contiguous subarray = [1 2 3] max = 3
2nd contiguous subarray = [2 3 1] max = 3
3rd contiguous subarray = [3 1 4] max = 4
4th contiguous subarray = [1 4 5] max = 5
5th contiguous subarray = [4 5 2] max = 5
6th contiguous subarray = [5 2 3] max = 5
7th contiguous subarray = [2 3 6] max = 6
```

```bash
Input: k = 4, arr[] = [8, 5, 10, 7, 9, 4, 15, 12, 90, 13]
Output: [10, 10, 10, 15, 15, 90, 90]
Explanation:
1st contiguous subarray = [8 5 10 7], max = 10
2nd contiguous subarray = [5 10 7 9], max = 10
3rd contiguous subarray = [10 7 9 4], max = 10
4th contiguous subarray = [7 9 4 15], max = 15
5th contiguous subarray = [9 4 15 12], max = 15
6th contiguous subarray = [4 15 12 90], max = 90
7th contiguous subarray = {15 12 90 13}, max = 90
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(k)

Constraints:
1 ≤ sizeof(arr) ≤ 106
1 ≤ k ≤ sizeof(arr)
0 ≤ arr[i] ≤ 109

## Solution

```java
class Solution {
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Get the length of the input array
        int n = arr.length;

        // Initialize an empty ArrayList to store the maximum elements of subarrays
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize a Deque (double-ended queue) to store indices of elements in the array
        Deque<Integer> dq = new ArrayDeque<>();

        // Process the first 'k' elements of the array
        for(int i=0; i<k; i++){
            // Remove elements from the back of the deque that are smaller than the current element
            while(!dq.isEmpty() && arr[ dq.peekLast() ] <= arr[i]){
                dq.removeLast();
            }

            // Add the current element to the back of the deque
            dq.addLast(i);
        }

        // Add the maximum element of the first subarray to the result list
        ans.add(arr[ dq.peekFirst() ]);

        // Process the remaining elements of the array
        for(int i=k; i<n; i++){
            // Remove elements from the front of the deque that are out of the current window
            if(dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            // Remove elements from the back of the deque that are smaller than the current element
            while(!dq.isEmpty() && arr[ dq.peekLast() ] <= arr[i]){
                dq.removeLast();
            }

            // Add the current element to the back of the deque
            dq.addLast(i);

            // Add the maximum element of the current subarray to the result list
            ans.add(arr[ dq.peekFirst() ]);
        }

        // Return the result list
        return ans;
    }
}
```
