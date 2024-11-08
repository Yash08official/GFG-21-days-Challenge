class Solution {
    static int minRepeats(String s1, String s2) {
        
        for(int i = 0; i < s2.length(); i++){
            if(!s1.contains(String.valueOf(s2.charAt(i)))){
                return -1;
            }
        }
        
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        while(sb.length()<s2.length()){
            count++;
            sb.append(s1);
        }
        if(sb.toString().contains(s2)){
            return count;
        }
        sb.append(s1);
        count++;
        if(sb.toString().contains(s2)){
            return count;
        }
        return -1;
    }
};