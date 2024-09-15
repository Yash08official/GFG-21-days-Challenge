
class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head;
    Node prev;
    void helper(Node root){
        if(root == null) 
        return;
        helper(root.left);
        
        if(prev == null)
        head = root;
        else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        helper(root.right);
    }
    Node bToDLL(Node root)
    {
	//  Your code here	
	head = null;
	prev = null;
	helper(root);
	return  head;
    }
}