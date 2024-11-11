class Solution {
    public int minIncrements(int[] arr) {
        Arrays.sort(arr);
        int prev=arr[0], ans=0, n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<=prev){
                ans+=(prev-arr[i]+1);
                prev++;
            }else{
                prev=arr[i];
            }
        }
        return ans;
    }
}