class GfG {
    // Function to start the QuickSort process on a linked list.
    public static Node quickSort(Node node) {
        myquickSort(node, null);  // Call recursive quicksort on the entire list
        return node;  // Return the sorted list
    }

    // Recursive function to apply quicksort on a linked list.
    static void myquickSort(Node start, Node end) {
        // Base case: If the starting node is null or only one node is left
        if (start == null || start == end) return;

        // Partition the list around a pivot and get the pivot position
        Node pivot = partition(start, end);
        
        // Recursively sort the list before the pivot and after the pivot
        myquickSort(start, pivot);
        myquickSort(pivot.next, end);
    }

    // Function to partition the list around a pivot
    static Node partition(Node start, Node end) {
        Node pivot = start;  // Choose the start node as pivot
        Node left = start;  // Left boundary for swapping nodes
        
        // Traverse the list until the end, rearranging nodes around the pivot
        for (Node j = start; j != end; j = j.next) {
            // If the current node's data is less than pivot data
            if (j.data < pivot.data) {
                // Swap the node after 'left' with 'j' to keep it on the left side
                swap(left.next, j);
                left = left.next;  // Move the 'left' boundary one node right
            }
        }
        
        // Place the pivot in its correct position by swapping with 'left'
        swap(left, pivot);
        
        return left;  // Return the position of the pivot after partition
    }

    // Utility function to swap data between two nodes
    static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
