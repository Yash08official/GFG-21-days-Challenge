class Solution {
    // Function to reverse a circular linked list
    reverse(head) {
        // Check if the list is empty or has only one node
        if (head === null || head.next === head) {
            return head; // No need to reverse; return as is
        }

        let curr = head.next; // Start with the node next to head
        let nxt = null; // This will hold the next node temporarily
        let prev = head; // This will point to the previous node

        // Loop to reverse the links until we reach back to the head
        while (curr !== head) {
            nxt = curr.next; // Store the next node
            curr.next = prev; // Reverse the current node's next pointer to point to the previous node
            prev = curr; // Move prev to the current node
            curr = nxt; // Move to the next node in the order
        }

        // After the loop, connect the old head to the new head
        head.next = prev;
        // Return the new head
        return prev;
    }

    // Function to delete a node from the circular linked list
    deleteNode(head, key) {
        // Check if the list is empty
        if (head === null) {
            return null; // Return null if there is nothing to delete
        }

        let temp = head.next; // Start from the node next to head
        let prev = head; // Set prev to head

        // Check if the node to delete is the head
        if (head.data === key) {
            // If there is only one node in the list
            if (head.next === head) {
                return null; // List becomes empty; return null
            } else {
                // Find the last node in the circular list
                while (temp.next !== head) {
                    prev = temp; // Move prev to the last node
                    temp = temp.next; // Move to the next node
                }
                // Update the last node's next pointer to the new head
                temp.next = head.next; // Last node points to the second node
                head = head.next; // Move head to the next node (new head)
                return head; // Return new head
            }
        }

        // Look for the key in the rest of the list (not including head)
        while (temp !== head && temp.data !== key) {
            prev = temp; // Move prev to current node
            temp = temp.next; // Move to the next node
        }

        // If the node with the key was found
        if (temp !== head) {
            prev.next = temp.next; // Bypass the node to delete it
        }

        return head; // Return the head of the list
    }
}
