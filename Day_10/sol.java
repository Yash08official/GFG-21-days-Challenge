class Solution {
    Node copyList(Node head) {
        Node cur = head;
        
        //clone node
        while(cur!=null){
            Node temp = new Node(cur.data);
            temp.next = cur.next;
            cur.next = temp;
            
            cur = cur.next.next;
        }
        
        cur = head;
        
        //add random to the clone nodes
        while(cur!=null){
            cur.next.random = cur.random==null ? null : cur.random.next;
            cur = cur.next.next;
        }
        
        cur = head;
        Node clone_head = head.next, clone_cur = clone_head;
        
        //remove connection
        while(cur!=null){
            cur.next = cur.next.next;
            
            if(clone_cur.next!=null)
                clone_cur.next = clone_cur.next.next;
            
            cur = cur.next;
            clone_cur = clone_cur.next;
        }
        
        return clone_head;
    }
}