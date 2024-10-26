# Occurence of an integer in a Linked List

Given a singly linked list and a key, count the number of occurrences of the given key in the linked list.

Examples:

```bash
Input: Linked List: 1->2->1->2->1->3->1, key = 1

Output: 4
Explanation: 1 appears 4 times.
```

```bash
Input: Linked List: 1->2->1->2->1, key = 3

Output: 0
Explanation: 3 appears 0 times.
```

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ number of nodes, key ≤ 105
1 ≤ data of node ≤ 105

### Solution

#### Java

```java
class Solution {
    public static int count(Node head, int key) {
        int ans=0;
        for(Node cur=head;cur!=null;cur=cur.next)   if(cur.data==key)   ans++;
        return ans;
    }
}
```
