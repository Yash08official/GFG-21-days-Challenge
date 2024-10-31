class Solution {
    public Node sortedInsert(Node head, int x) {
        // Create a new node with the given value x
        Node node = new Node(x);
        
        // Case 1: Insert at the beginning if x is smaller than the head's data
        if (x < head.data) {
            node.next = head;      // Point the new node's next to current head
            head.prev = node;      // Update the previous of head to new node
            return node;           // New node is the new head now
        }
        
        // Case 2: Insert somewhere in the middle or at the end
        Node cur = head;           // Start from the head
        
        // Traverse until we find the right position for insertion
        while (cur.next != null && cur.next.data < x) {
            cur = cur.next;
        }
        
        // Insert the new node after the 'cur' node
        node.next = cur.next;      // New node points to the next node of 'cur'
        node.prev = cur;           // New node's previous is the 'cur' node
        cur.next = node;           // 'cur' node's next now points to the new node
        
        // Check if there is a node after the new node and update its previous
        if (node.next != null) {
            node.next.prev = node; // Update the next node's previous to the new node
        }
        
        return head;               // Return the head of the updated list
    }
}
