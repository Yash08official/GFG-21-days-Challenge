/*LINKED LIST NODE
class Node {
  constructor(x){
    this.data = x;
    this.next = null;
  }
}
*/

/**
 * @param {Node} l1
 * @param {Node} l2
 * @return {number}
 */

// Use Bigint for javascript
class Solution {
    // Multiplies two numbers represented as linked lists.
    multiplyTwoLists(first, second) {
        // Convert the first linked list to a BigInt number
        let num1 = this.convertListToNumber(first);
         // Convert the second linked list to a BigInt number
        let num2 = this.convertListToNumber(second);
        // Multiply the two numbers and take the modulo to prevent overflow
        return Number((num1 * num2) % 1000000007n);
    }

    convertListToNumber(node) {
        // the result to 0
        let result = 0n;
        while (node !== null) {
            // Multiply the current result by 10 and add the current node's value
            result = (result * 10n) + BigInt(node.data);
             // Move to the next node
            node = node.next;
        }
        // Return the final result
        return result;
    }
}