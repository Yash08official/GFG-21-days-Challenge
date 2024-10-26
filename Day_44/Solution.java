class Solution {
    public static int count(Node head, int key) {
        int ans=0;
        for(Node cur=head;cur!=null;cur=cur.next)   if(cur.data==key)   ans++;
        return ans;
    }
}