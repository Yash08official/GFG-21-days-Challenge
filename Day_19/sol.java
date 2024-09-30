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