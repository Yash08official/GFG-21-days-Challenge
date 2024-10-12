class Solution {
    public int pairWithMaxSum(int[] arr) {
        int n = arr.length;
        if(n==1)    return -1;
        
        int ans=0;
        for(int i=0;i<n-1;i++){
            int cur = arr[i]+arr[i+1];
            ans = Math.max(ans,cur);
        }
        return ans;
    }
}