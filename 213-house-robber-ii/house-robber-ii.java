class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans1 = rob_house(1,dp,nums,n);
        Arrays.fill(dp,-1);
        int ans2 = rob_house(0,dp,nums,n-1);

        return Math.max(ans1,ans2);
    }

    public int rob_house(int i,int[] dp,int[] nums,int n){
        if(i > n-1){
            return 0;
        }

        if(dp[i]!= -1){
            return dp[i];
        }

        int include = nums[i] + rob_house(i+2,dp,nums,n);
        int exclude = 0+ rob_house(i+1,dp,nums,n);

        dp[i] = Math.max(include,exclude);
        return dp[i];

    }
}