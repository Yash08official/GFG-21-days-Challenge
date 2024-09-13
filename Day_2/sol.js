class Solution {
    // Function to convert a binary tree into its mirror tree.
    mirror(node) {
        // base case: if node is null, return
        if (node === null) {
            return;
        } else {
            // recursively call mirror on left and right subtrees
            this.mirror(node.left);
            this.mirror(node.right);

            // swap left and right child nodes
            let temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}