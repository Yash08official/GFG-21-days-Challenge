class Solution {
    /**
     * Performs a pre-order traversal of a binary tree and adds node values to a list.
     * @param {Node} root The root of the binary tree.
     * @param {number[]} list The list to which node values are added.
     */
    preOrderTraversal(root, list) {
      if (root === null) {
        return;
      }
  
      list.push(root.data);
      this.preOrderTraversal(root.left, list);
      this.preOrderTraversal(root.right, list);
    }
  
    /**
     * Merges two binary search trees into a single sorted list.
     * @param {Node} root1 The root of the first binary search tree.
     * @param {Node} root2 The root of the second binary search tree.
     * @returns {number[]} A sorted list of node values from both trees.
     */
    merge(root1, root2) {
      const list = [];
      this.preOrderTraversal(root1, list);
      this.preOrderTraversal(root2, list);
  
      list.sort((a, b) => a - b);
      return list;
    }
  }