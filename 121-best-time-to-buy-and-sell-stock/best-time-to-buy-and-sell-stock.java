class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int minsofar = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            minsofar = Math.min(minsofar,prices[i]);
            maxi = Math.max(maxi,prices[i] - minsofar);
        }
        return maxi;
    }
}