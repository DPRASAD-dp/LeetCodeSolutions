import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return maxProfit_dp(0,1,prices,dp);
    }

    public int maxProfit_dp(int i,int j,int[] prices,int[][] dp){
        if(i == prices.length){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int buy = 0;
        int notbuy = 0;
        int sell = 0;
        int notsell = 0;

        if(j == 1){
            buy = -prices[i] + maxProfit_dp(i+1,0,prices,dp);
            notbuy = maxProfit_dp(i+1,1,prices,dp);
        }
        else{
            sell = prices[i] + maxProfit_dp(i+1,1,prices,dp);
            notsell = maxProfit_dp(i+1,0,prices,dp);
        }

        dp[i][j] = Math.max(Math.max(buy,notbuy),Math.max(sell,notsell));
        return dp[i][j];



    }

}