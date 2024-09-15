/**
 * @param {Node} root
 * @returns {Node}
*/

/*
class Node{
    constructor(data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    constructor() {
        this.head = null;
        this.prev = null;
    }

    //Function to convert a binary tree to doubly linked list and return it.
    helper(root){
        if(root == null) 
        return;
        this.helper(root.left);
        
        if(this.prev == null)
        this.head = root;
        else{
            this.prev.right = root;
            root.left = this.prev;
        }
        this.prev = root;
        this.helper(root.right);
    }
    bToDLL(root)
    {
        this.head = null;
        this.prev = null;
        this.helper(root);
        return  this.head;
    }
}