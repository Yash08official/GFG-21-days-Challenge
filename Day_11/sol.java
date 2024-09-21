class Solution {
    int lps(String str) {
        int n=str.length();
        int a[] = new int[n];
        int j=0;
        for(int i=1;i<n;){
            if(str.charAt(i)==str.charAt(j)){
                a[i]=j+1;
                j++;
                i++;
            }else{
                if(j==0)    i++;
                else    j=a[j-1];
            }
        }
        return a[n-1];
    }
}