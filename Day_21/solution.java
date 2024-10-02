import java.util.ArrayList;

class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // Initial size of the array
        int n = arr.size();
        // Initially k = 1, which keeps track of the delete step
        int k = 1;

        // While loop: continue until only one element is left in the array
        while (n > 1) {
            // Rotate: Remove the last element and add it to the front
            arr.add(0, arr.remove(n - 1));

            // Calculate the index to delete: (n - k)
            int id = n - k;

            // If the calculated index is negative, set it to 0 to avoid an invalid index
            if (id < 0) id = 0;

            // Remove the element at the calculated index
            arr.remove(id);

            // Increment k to move to the next step
            k++;

            // Decrease the size of the array after the deletion
            n--;
        }

        // Return the last remaining element in the array
        return arr.get(0);
    }
}