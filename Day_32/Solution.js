class Solution {
    // Function to count nodes of a linked list.
    getCount(head) {
        // Initially, the current node is at head
        let curr = head;
        // Length is 0 at the beginning
        let n = 0;

        // While curr is not null and pointing to a node
        while (curr !== null) {
            // Increment the length of the node
            n++;
            // Move to the next node
            curr = curr.next;
        }

        // Return the total count of nodes
        return n;
    }
}
