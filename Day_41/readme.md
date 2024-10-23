# Find the Sum of Last N nodes of the Linked List

Given a single linked list, calculate the sum of the last n nodes.

Note: It is guaranteed that n <= number of nodes.

Examples:

```bash
Input: Linked List: 5->9->6->3->4->10, n = 3
Output: 17
Explanation: The sum of the last three nodes in the linked list is 3 + 4 + 10 = 17.
```

```bash
Input: Linked List: 1->2, n = 2
Output: 3
Explanation: The sum of the last two nodes in the linked list is 2 + 1 = 3.
```

Constraints:
1 <= number of nodes, n <= 105
1 <= node->data <= 103

### Solution

### Java

```java
class Solution {
    public int sumOfLastN_Nodes(Node head, int n) {
        Node cur = head; // Pointer to traverse the list
        Node prev = head; // Pointer to mark the start of the window of last N nodes
        int ans = 0; // Variable to store the sum of the last N nodes

        // Traverse the linked list with cur
        while (cur != null) {
            ans += cur.data; // Add current node's value to the sum
            n--; // Decrease n to track when the window size exceeds N

            // When n is negative, it means we have traversed more than N nodes
            if (n < 0) {
                ans -= prev.data; // Subtract the value of the node pointed by prev from the sum
                prev = prev.next; // Move prev forward to keep the window size N
            }

            cur = cur.next; // Move cur to the next node
        }

        return ans; // Return the sum of the last N nodes
    }
}
```
