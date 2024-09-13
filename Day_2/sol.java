class Solution {
    // Function to convert a binary tree into its mirror tree.
    public void mirror(Node node) {
        // base case: if node is null, return
        if (node == null) {
            return;
        } else {
            // recursively call mirror on left and right subtrees
            mirror(node.left);
            mirror(node.right);

            // swap left and right child nodes
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}