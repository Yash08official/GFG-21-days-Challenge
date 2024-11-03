class Solution {
    public boolean isLengthEven(Node head) {

        // Initialize a counter to count the number of nodes
        int count = 0;
        // Start from the head of the linked list
        Node curr = head;

        // Traverse the linked list until the end
        while (curr != null) {
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