/**
 * @param {LinkedListNode} head
 * @returns {boolean}
 */

class LinkedListNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    // Function to check whether the list is palindrome.
    isPalindrome(head) {
        let slow = head, fast = head, prev = head;
        while (fast !== null && fast.next !== null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        let b = null;
        prev.next = null;
        if (fast !== null)  b = this.reverse(slow.next);
        else  b = this.reverse(slow);
        let a = head;
        while (a !== b && b !== null) {
            if (a.data !== b.data)  return false;
            a = a.next;
            b = b.next;
        }
        return true;
    }

    reverse(root) {
        if (root === null || root.next === null)  return root;
        let temp = this.reverse(root.next);
        root.next.next = root;
        root.next = null;
        return temp;
    }
}