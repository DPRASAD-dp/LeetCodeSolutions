class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int start =0;
        int end = 1;
        while(end<n){
            if(prices[start]>prices[end]){
                start = end;
                end++;
            }
            else{
                int ans = prices[end] - prices[start] ;
                maxprofit  = Math.max(maxprofit,ans);
                end++;
            }
            
        }
        return maxprofit;
    }
}