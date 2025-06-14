class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 1;i<n;i++){
            for(int j= 0;j<i;j++){
                if(nums[j] < nums[i] ){
                    if(dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;
                    }
                }
            }
        }
        int maxi = 0;

        for(int i =0;i<n;i++){
            if(dp[i] > maxi){
                maxi = dp[i];
            }
        }
        return maxi;
    }
}