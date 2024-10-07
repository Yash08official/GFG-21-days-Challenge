// class Node {
//     int data;
//     Node npx;

//     Node(int x) {
//         data = x;
//         npx = null;
//     }
// }
class Solution {
    // function should insert the data to the front of the list
    static Node insert(Node head, int data) {
        // Code Here.
        // we create sepreate node first
         Node new_head = new Node(data);
         
         new_head.npx = head ;
         return new_head;
    }

    // function to print the linked list
    static ArrayList<Integer> getList(Node head) {
        // Code Here.
        // Intially current pointer is haed 
        Node curr = head;
        
        // create seprate array list you want to return list
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(curr != null){
            al.add(curr.data); // store value
            curr = curr.npx; // move to next
        }
        return al;
    }
}