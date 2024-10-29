class Solution {
    public static Node quickSort(Node node) {
        myquickSort(node,null);
        return node;
    }
    static void myquickSort(Node start,Node end){
        if(start==null || start==end)  return;
        
        Node pivot = parition(start,end);
        myquickSort(start,pivot);
        myquickSort(pivot.next,end);
    }
    static Node parition(Node start,Node end){
        Node pivot = start;
        Node left = start;
        
        for(Node j=start;j!=end;j=j.next){
            if(j.data<pivot.data){
                swap(left.next,j);
                left = left.next;
            }
        }
        
        swap(left,pivot);
        
        return left;
    }
    static void swap(Node a,Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}