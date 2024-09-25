class Solution {
    public int maxStep(int arr[]) {
        int ans=0, cur=0, n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                cur++;
            }else{
                cur=0;
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}