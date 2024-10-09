class Solution {
    // Function to construct a 2D linked list from a 2D array
    constructLinkedMatrix(mat) {
        // Get the dimensions of the matrix
        const n = mat.length;
        const m = mat[0].length;

        // Call the recursive helper function to build the linked matrix
        return this.solve(0, 0, n, m, mat);
    }

    // Recursive function to build the linked matrix
    solve(i, j, n, m, mat) {
        // Base case: if the index is out of bounds, return null
        if (i >= n || j >= m) return null;

        // Create a temporary node for the current element
        const temp = new Node(mat[i][j]);

        // Set the right pointer (same row, next column)
        temp.right = this.solve(i, j + 1, n, m, mat);

        // Set the down pointer (next row, same column)
        temp.down = this.solve(i + 1, j, n, m, mat);

        // Return the created node
        return temp;
    }
}