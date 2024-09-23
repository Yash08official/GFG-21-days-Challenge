class Solve {
    int[] findTwoElement(int arr[]) {
        int xor=0, a=0, b=0, n=arr.length;
        
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
            xor = xor^(i+1);
        }
        
        int lsb = (xor & ~(xor-1));
        
        for(int i:arr){
            if( (i&lsb) >0) a^=i;
            else    b^=i;
        }
        for(int i=1;i<=n;i++){
            if( (i&lsb) >0) a^=i;
            else    b^=i;
        }
        for(int i:arr){
            if(a==i)    return new int[]{a,b};
            else if(b==i)   return new int[]{b,a};
        }
        return new int[]{-1,-1};
    }
}