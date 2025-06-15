import java.util.*;
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];

        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }

       int[] arr = new int[n+2];
     
       arr[0] = 1;
       arr[n+1] = 1;

       for(int i =1;i<n+1;i++){
        arr[i] = nums[i-1];
       }
       
        return dp_maxcoins(1,arr.length-2,arr,dp);
    }
    public int dp_maxcoins(int i,int j,int[] arr,int[][] dp){
        if(i>j){
            return 0;
                }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int maxi = Integer.MIN_VALUE;
        for(int k = i;k<j+1;k++){
            int cost = (arr[i-1]*arr[k]*arr[j+1]) + dp_maxcoins(i,k-1,arr,dp) + dp_maxcoins(k+1,j,arr,dp);
            maxi = Math.max(maxi,cost);
        }

        dp[i][j] = maxi;
        return maxi;
    }
}