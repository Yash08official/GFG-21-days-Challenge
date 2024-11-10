class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int i=0, j=0, n=a.length, m=b.length;
        while(i<n && j<m){
            if(a[i]==b[j]){
                al.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                al.add(a[i++]);
            }else{
                al.add(b[j++]);
            }
        }
        
        while(i<n)  al.add(a[i++]);
        while(j<m)  al.add(b[j++]);
        
        return al;
    }
}