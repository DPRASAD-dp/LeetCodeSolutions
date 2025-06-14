import java.util.*;
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }

        return wildcard_dp(0,0,s,p,dp,m,n);
    }

    public boolean wildcard_dp(int i,int j,String s, String p,int[][] dp,int m,int n){
        if(i==m && j==n){
            return true;
        }

        if(j == n){
            return false;
        }
        if(i == m){
            for(int k = j ;k<n;k++){
                if(p.charAt(k) != '*'){
                    return false;
                }
                
            }
            return true;

        }

        if(dp[i][j] != -1){
            if(dp[i][j] == 0){
                return false;
            }
            else{
                return true;
            }
        }

        boolean include = false;
        boolean use = false;

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
            include = wildcard_dp(i+1,j+1,s,p,dp,m,n);
        }

        else if(p.charAt(j) == '*'){

        use = wildcard_dp(i+1,j,s,p,dp,m,n) || wildcard_dp(i,j+1,s,p,dp,m,n);
        }
        else{
            dp[i][j] = 0;
        }

        if(include || use){
            dp[i][j] = 1;
        }
        else{
            dp[i][j] = 0;
        }

        if(dp[i][j] == 1){
            return true;
        }
        else{
            return false;
        }

    }


}