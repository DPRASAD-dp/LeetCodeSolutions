import java.util.*;
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];

        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        } 

        return lcs_dp(0,0,text1,text2,dp,m,n);
    }

    public int lcs_dp(int i,int j,String text1, String text2,int[][] dp,int m,int n){
        if(i > m-1 || j > n-1){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int include = 0;
        int exclude1 = 0;
        int exclude2 = 0;

        if(text1.charAt(i) == text2.charAt(j)){
          include = 1+ lcs_dp(i+1,j+1,text1,text2,dp,m,n);
        }
        else{
            exclude1 = lcs_dp(i,j+1,text1,text2,dp,m,n);
            exclude2 = lcs_dp(i+1,j,text1,text2,dp,m,n);
        }

        dp[i][j]  = Math.max(include,Math.max(exclude1,exclude2));
        return dp[i][j];


        



    }
}