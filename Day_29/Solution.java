class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        int i=0, n=arr.size();
        while(i<n){
            if(arr.get(i)==-1 || arr.get(i)==i) i++;
            else{
                int id = arr.get(i);
                arr.set(i,arr.get(id));
                arr.set(id,id);
            }
        }
        return arr;
    }
}