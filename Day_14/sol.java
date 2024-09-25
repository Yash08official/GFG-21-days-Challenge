class Solution {
    boolean isPalindrome(Node head) {
        Node slow = head, fast = head, prev=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        Node b=null;
        prev.next=null;
        if(fast!=null)  b = reverse(slow.next);
        else    b = reverse(slow);
        Node a=head;
        while(a!=b && b!=null){
            if(a.data!=b.data)    return false;
            a=a.next;
            b=b.next;
        }
        return true;
    }
    Node reverse(Node root){
        if(root==null || root.next==null)   return root;
        Node temp = reverse(root.next);
        root.next.next=root;
        root.next=null;
        return temp;
    }
}