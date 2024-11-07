{
    public List<Integer> findSplit(int[] arr) {
        int sum=Arrays.stream(arr).sum();
        
        if(sum%3!=0)    return Arrays.asList(-1,-1);
        
        int n=arr.length, cur=0, freq=0, end=-1;
        
        for(int i=0;i<n;i++){
            cur+=arr[i];
            if(cur==sum/3){
                if(end==-1) end=i;
                freq++;
                cur=0;
            }else if(cur>sum/3){
                return Arrays.asList(-1,-1);
            }
        }
        
        return Arrays.asList(0,end);
    }
}