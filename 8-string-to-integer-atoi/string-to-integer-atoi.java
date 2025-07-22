class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0 || s == null ) return 0;
        long sum = 0;
        s = s.trim();
        if (s.length() == 0) return 0;
        int sign = 1;
        int i =0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+'){
            sign = +1;
            i++;
        }
        for(;i<s.length();i++){
           
        
        if(!Character.isDigit(s.charAt(i))){
            break;
        }
            sum = sum*10 + (s.charAt(i)-'0');
            if (sign > 0 && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign<0 && -sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int)sum*sign;
    }
}