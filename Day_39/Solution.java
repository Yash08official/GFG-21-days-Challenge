class Solution {
    public static int countgroup(int arr[]) {
        int xor=0, n=arr.length;
        for(int i:arr)  xor^=i;
        if(xor!=0)  return 0;
        return (1<<(n-1))-1;
    }
}