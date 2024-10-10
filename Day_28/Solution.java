class Solution {
    public int maxDistance(int[] arr) {
        Map<Integer,Integer> map  = new HashMap<>();
        int n  =arr.length, ans=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int diff = i-map.get(arr[i]);
                ans=  Math.max(ans,diff);
            }else{
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}