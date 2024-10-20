class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        PriorityQueue<DLLNode> pq = new PriorityQueue<>((o1,o2)->o1.data-o2.data);
        
        DLLNode cur_head = head; 
        DLLNode ans = null, cur_ans = null;
        while(cur_head!=null){
            pq.add(cur_head);
            
            if(pq.size()==k+1){
                DLLNode pop = pq.remove();
                if(ans==null){
                    ans = pop;
                    cur_ans=pop;
                }else{
                    cur_ans.next = pop;
                    pop.prev = cur_ans;
                    cur_ans = cur_ans.next;
                }
            }
            
            
            cur_head = cur_head.next;
        }
        
        while(!pq.isEmpty()){
            DLLNode pop = pq.remove();
            if(ans==null){
                ans = pop;
                cur_ans=pop;
            }else{
                cur_ans.next = pop;
                pop.prev = cur_ans;
                cur_ans = cur_ans.next;
            }
        }
        
        ans.prev = null;
        cur_ans.next = null;
        
        return ans;
    }
}