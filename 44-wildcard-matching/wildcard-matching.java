class Solution {
    public boolean isMatch(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        int[][] cache = new int[n1][n2];

        for(int[] row : cache){
            Arrays.fill(row,-1);
        }
        return helper(0,n1,s,0,n2,p,cache);
    }

    boolean helper(int index1,int n1,String s,int index2,int n2,String p,int[][] cache){

        if(index1 == n1){
            while(index2<n2){
                if(p.charAt(index2) != '*'){
                    return false;
                }
                index2++;
            }
            return true;
        }
        else if(index2 == n2){
            return false;
        }

        if(cache[index1][index2] != -1){
            if(cache[index1][index2] == 1){
                return true;
            }
            else{
                return false;
            }
        }

        boolean result = false;
        if(s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '?'){
            return helper(index1+1,n1,s,index2+1,n2,p,cache);
        }
        else if(p.charAt(index2)=='*'){
            boolean choice1 = helper(index1,n1,s,index2+1,n2,p,cache);
            boolean choice2 = helper(index1+1,n1,s,index2,n2,p,cache);
            result = choice1 || choice2;
        }
        if(result == true){
            cache[index1][index2] = 1;
        }
        else{
            cache[index1][index2] = 0;

        }
        return result;
}}