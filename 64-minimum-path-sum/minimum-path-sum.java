import java.util.*;
class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return numberOfPaths_dp(0,0,m,n,grid,dp);
    }
    
    public int numberOfPaths_dp(int i,int j,int m,int n,int[][] grid,int[][] dp){
        
        if(i >= m || j>= n ){
            return Integer.MAX_VALUE;
        }

        if( i == m-1 && j == n-1){
            return grid[m-1][n-1];
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int rightstep = 0;
        int downstep = 0;
        
        if(j<n && i<m){
            rightstep = numberOfPaths_dp(i,j+1,m,n,grid,dp);
        }
        if(i<m && j<n){
            downstep = numberOfPaths_dp(i+1,j,m,n,grid,dp);
        }
        
        int minCost = Math.min(rightstep, downstep);
        
        dp[i][j] = grid[i][j] + (minCost == Integer.MAX_VALUE ? 0 : minCost);
        return dp[i][j];
    }
}