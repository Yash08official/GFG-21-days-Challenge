# Quick Sort on Linked List

You are given a Linked List. Sort the given Linked List using quicksort.

Examples:

```bash
Input: Linked list: 1->6->2
Output: 1->2->6

Explanation:
After sorting the nodes, we have 1, 2 and 6.
```

```bash
Input: Linked list: 1->9->3->8
Output: 1->3->8->9

Explanation:
After sorting the nodes, we have 1, 3, 8 and 9.
```

Constraints:
1<= size of linked list <= 105

### Solution

#### Java

```java
class GfG {
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
```
