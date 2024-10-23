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