class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = Integer.MAX_VALUE;
        int profit = 0;
        for(int i =0;i<n;i++){
            if(prices[i] < mini){
                mini = prices[i];
            }
            else{
                if(prices[i] > mini && (prices[i]-mini) > profit){
                    profit = prices[i]-mini;
                }
            }
        }
        return profit;
    }
}