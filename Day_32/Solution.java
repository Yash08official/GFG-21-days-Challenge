class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        
        // Intially current node at head
        Node curr = head;
        // length is 0 first
        int n = 0;
        
        // curr is not null and pointing to a node then 
        while(curr != null){
            
            // incremeant length of node and
            n++;
            // jump to the next node
            curr = curr.next;
        }
        
        return n;
    }
}
