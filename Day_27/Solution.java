class Solution {
    static Node construct(int arr[][]) {
        // we have to find the length first
        int n = arr.length, m = arr.length;
        // we have function "Solve" using recursive manner approach
        return solve(0,0,n,m,arr);
    }
        static Node solve(int i,int j,int n,int m,int a[][]){
    // now we have base case if the index is out of bound (outside jr geli tr) return null
        if(i>= n || j>= m)
        return null;
        // we create a temporary node 
        Node temp = new Node(a[i][j]);
        // Now there are two pointer right and down
        // right pointer point to same row and increment column
        temp.right = solve(i,j+1,n,m,a);
        temp.down = solve(i+1,j,n,m,a);
        // at the end we return temporary node
        return temp;
    }
}