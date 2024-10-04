class Solution {
    //firstly Function to reverse the circular linked list
    
    Node reverse(Node head) {
        
        // Check if the list is empty or has only one node
        if (head == null || head.next == head) {
            return head; // No need to reverse; return as is
        }
        
        
        // Start with the node next to head
        Node curr = head.next; 
        // This will hold the next node temporarily
        Node nxt = null;
        // This will point to the previous node
        Node prev = head;  


        //I used Loop to reverse the links until we reach back to the head
        while (curr != head) {
            // Store the next node
            nxt = curr.next; 
            // Reverse the current node next pointer to point to previous node
            curr.next = prev; 
            // Move prev to the current node
            prev = curr; 
            // Move to the next node in the order
            curr = nxt; 
        }


        // After the loop, Connect the old head to the new head
        head.next = prev; 
        //and return the new head
        return prev; 
    }
    
    

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        
        // Check if the list is empty
        if (head == null) {
            // Return null if there nothing to delete
            return null; 
        }
        

        // Set pointers to find the node to delete
        Node temp = head.next; // Start from the node next to head
        Node prev = head; // set prev to head


        // Check if the node to delete is the head
        if (head.data == key) {
            // If there is only one node in the list
            if (head.next == head) {
                // List becomes empty; return null
                return null; 
            } else {
                // Find the last node in the circular list
                while (temp.next != head) {
                    prev = temp; // Move prev to the last node
                    temp = temp.next; // Move to the next node
                }
                // Update the last node next pointer to the new head
                temp.next = head.next; // Last node points to the second node
                head = head.next; // Move head to the next node (new head)
                return head; // Return new head
            }
        }


        // Look for the key in the rest of the list (not including head)
        while (temp != head && temp.data != key) {
            prev = temp; // Move prev to current node
            temp = temp.next; // Move to the next node
        }

        // If the node with the key was found
        if (temp != head) {
            // Bypass the node to delete it
            prev.next = temp.next; 
        }

        // Return the head of the list 
        return head; 
    }
}
