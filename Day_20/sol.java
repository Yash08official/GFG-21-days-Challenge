class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Calculate the numerical values of the two linked lists
        long a = value(first), b = value(second), 
        // Define the modulo value to prevent overflow
        mod = (long)1e9+7;
        // Multiply the two numerical values and take the modulo
        return (a%mod * b%mod)%mod;
    }
    long value(Node node){
        // the result to 0
        long ans=0, 
        // Define the modulo value to prevent overflow
        mod = (long)1e9+7;
        while(node!=null){
            // Multiply the current result by 10 and add the current node's value
            // Take the modulo to prevent overflow
            ans = (ans*10%mod + node.data)%mod;
            // Move to the next node
            node = node.next;
        }
        // Return the final result
        return ans;
    }
}