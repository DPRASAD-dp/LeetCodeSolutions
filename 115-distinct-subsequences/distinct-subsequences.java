import java.util.*;
class Solution {
    public int numDistinct(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m+1][n+1];
        for (int[] row : dp)
        Arrays.fill(row, -1);

        return numdist_dp(0,0,s,t,dp,m,n);
    }

    public int numdist_dp(int i,int j,String s, String t,int[][] dp,int m,int n){
        if (j == n) return 1;    
        if (i == m) return 0; 

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int include= 0;

        if(s.charAt(i) ==  t.charAt(j)){
          include = numdist_dp(i+1,j+1,s,t,dp,m,n) + numdist_dp(i+1,j,s,t,dp,m,n);
        }

        int exclude = numdist_dp(i+1,j,s,t,dp,m,n);

        dp[i][j] =Math.max(include,exclude);
        return dp[i][j];
           }
}