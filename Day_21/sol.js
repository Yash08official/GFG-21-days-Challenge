
// User function Template for javascript
class Solution {
    rotateDelete(arr) {
        // initial size of the array
        let n = arr.length;
        // initially k = 1 which keeps track of the deletion step
        let k = 1;

        // while loop: continue until only one element is left in the array
        while (n > 1) {
            // Rotate: Remove the last element and add it to the front
            arr.unshift(arr.pop());

            // Calculate the index to delete: (n - k)
            let id = n - k;

            // If the calculated index is negative, set it to 0 to avoid an invalid index
            if (id < 0) id = 0;

            // Remove the element at the calculated index
            arr.splice(id, 1);

            // Increment k to move to the next step
            k++;

            // Decrease the size of the array after the deletion
            n--;
        }

        // Return the last remaining element in the array
        return arr[0];
    }
}