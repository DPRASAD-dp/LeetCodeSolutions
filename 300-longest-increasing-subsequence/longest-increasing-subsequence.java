import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];

        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return lis_dp(0,-1,dp,nums,n);
    }

    public int lis_dp(int i,int j,int[][] dp,int[] nums,int n){
        if(i == n){
            return 0;
        }
        if(dp[i][j+1] != -1){
            return dp[i][j+1];
        }
        int include = 0;
        

        if(j == -1 || nums[i] > nums[j]){
            include = 1 + lis_dp(i+1,i,dp,nums,n);
        }

        int exclude = 0+lis_dp(i+1,j,dp,nums,n);

        dp[i][j+1] = Math.max(include,exclude);
        return dp[i][j+1];
    }
}