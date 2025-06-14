import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int[][][] dp = new int[n+1][2][3];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        return maxProfit_dp(0,1,prices,dp,0);
    }

    public int maxProfit_dp(int i,int j,int[] prices,int[][][] dp,int cap){
        if(i == prices.length || cap >= 2){
            return 0;
        }

        if (dp[i][j][cap] != -1) return dp[i][j][cap];

        int buy = 0;
        int notbuy = 0;
        int sell = 0;
        int notsell = 0;

        if(j == 1 && cap<4){
            buy = -prices[i] + maxProfit_dp(i+1,0,prices,dp,cap);
            notbuy = maxProfit_dp(i+1,1,prices,dp,cap);
        }
        else{
            sell = prices[i] + maxProfit_dp(i+1,1,prices,dp,cap+1);
            notsell = maxProfit_dp(i+1,0,prices,dp,cap);
        }

        dp[i][j][cap] = Math.max(Math.max(buy,notbuy),Math.max(sell,notsell));
        return dp[i][j][cap];



    }

}