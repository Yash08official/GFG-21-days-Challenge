# Is Linked List Length Even?

Given a linked list, your task is to complete the function isLengthEven() which contains the head of the linked list, and check whether the length of the linked list is even or not. Return true if it is even, otherwise false.

Examples:

```bash
Input: Linked list: 12->52->10->47->95->0

Output: true
Explanation: The length of the linked list is 6 which is even, hence returned true.
```

```bash
Input: Linked list: 9->4->3

Output: false
Explanation: The length of the linked list is 3 which is odd, hence returned false.
```

Expected Time Complexity: O(n)
Expected Auxillary Space: O(1)

Constraints:
1 <= number of nodes <= 105
1 <= elements of the linked list <= 105

### Solution

#### Java

```java
class Solution {
    public boolean isLengthEven(Node head) {

        // Initialize a counter to count the number of nodes
        int count = 0;
        // Start from the head of the linked list
        Node curr = head;

        // Traverse the linked list until the end
        while(curr != null){
            // Increment the count for each node
            count++;
            // Move to the next node
            curr = curr.next;
        }

        // Check if the count is even by using modulo operator
        // If count is even, return true; otherwise, return false
        return count % 2 == 0;
    }
}
```
