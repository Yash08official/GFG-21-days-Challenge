class Solution {
    String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length(), i=0;
        while(i<n){
            char c = s.charAt(i);
            
            if(c=='.'){
                i++;
                continue;
            }
            
            StringBuilder temp = new StringBuilder();
            while(i<n && s.charAt(i)!='.'){
                temp.append(s.charAt(i));
                i++;
            }
            
            ans.insert(0,temp+".");
        }
        
        return ans.toString().substring(0,n);
    }
}