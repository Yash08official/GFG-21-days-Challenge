class Solution {
    public static int treePathsSum(Node root) {
        return preOrder(root,0);
    }
    static int preOrder(Node node,int val){
        if(node==null)  return 0;
        val = val*10+node.data;
        
        if(node.left==null && node.right==null) return val;
        
        return preOrder(node.left,val) + preOrder(node.right,val);
    }
}