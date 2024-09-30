# Merge two BST 's

Given two BSTs, return elements of merged BSTs in sorted form.

Examples :

```bash
Input:
BST1:
       5
     /   \
    3     6
   / \
  2   4
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
Output: 1 2 2 3 3 4 5 6 6 7
Explanation: After merging and sorting the two BST we get 1 2 2 3 3 4 5 6 6 7.
```

```bash
Input:
BST1:
       12
     /
    9
   / \
  6   11
BST2:
      8
    /  \
   5    10
  /
 2
Output: 2 5 6 8 9 10 11 12
Explanation: After merging and sorting the two BST we get 2 5 6 8 9 10 11 12.
```

Expected Time Complexity: O((m+n)\*log(m+n))
Expected Auxiliary Space: O(Height of BST1 + Height of BST2 + m + n)

Constraints:
1 ≤ Number of Nodes, value of nodes ≤ 105

## Solution

### Java

```java
    class Solution {
        void preOrderTraversal(Node root,List<Integer> list){
            if(root == null){
                return;
            }

            list.add(root.data);
            preOrderTraversal(root.left,list);
            preOrderTraversal(root.right,list);
        }
        // Function to return a list of integers denoting the node
        // values of both the BST in a sorted order.
        public List<Integer> merge(Node root1, Node root2) {
            // Write your code here
            ArrayList<Integer> list = new ArrayList<>();
            preOrderTraversal(root1,list);
            preOrderTraversal(root2,list);

            Collections.sort(list);
            return list;
        }

    }
```

### JavaScript

```js
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
```
