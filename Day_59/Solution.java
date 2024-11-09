class Solution {
    String minSum(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        
        // Distribute numbers alternately into sb1 and sb2
        for (int i : arr) {
            if (flag) {
                sb1.append(i);
            } else {
                sb2.append(i);
            }
            flag = !flag;
        }
        
        int i = sb1.length() - 1, j = sb2.length() - 1, carry = 0;
        
        // Add the numbers represented by sb1 and sb2
        while (i >= 0 || j >= 0 || carry == 1) {
            int val1 = i >= 0 ? sb1.charAt(i) - '0' : 0;
            int val2 = j >= 0 ? sb2.charAt(j) - '0' : 0;  // Use j here for sb2
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            ans.append(sum % 10);
            i--;
            j--;
        }
        
        // Reverse to get the actual sum result
        String a = ans.reverse().toString();
        int z = 0;
        
        // Remove leading zeros
        while (z < a.length() && a.charAt(z) == '0') {
            z++;
        }
        
        // Return the result without leading zeros
        return a.substring(z);
    }
}