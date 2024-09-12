class Solution {
    /* Should return data of middle node. If linked list is empty, then  -1*/
    getMiddle(node) {
        let slow = head;
        let fast = head;
        while(fast !== null && fast.next !== null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}