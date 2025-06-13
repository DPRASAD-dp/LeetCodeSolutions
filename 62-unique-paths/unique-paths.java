import java.util.*;
class Solution {
    public int uniquePaths(int m, int n) {

        // Code Here
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return numberOfPaths_dp(1,1,m,n,dp);
    }
    
    public int numberOfPaths_dp(int i,int j,int m,int n,int[][] dp){
        if(i > m || j> n ){
            return 0;
        }
        
        if( i == m && j == n){
            return 1;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int rightstep = 0;
        int downstep = 0;
        
        if(j<n){
            rightstep = numberOfPaths_dp(i,j+1,m,n,dp);
        }
        if(i<m){
            downstep = numberOfPaths_dp(i+1,j,m,n,dp);
        }
        
        dp[i][j] = rightstep + downstep;
        return dp[i][j];
    }
}