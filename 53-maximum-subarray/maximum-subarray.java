class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxsum = nums[0];
        for(int j=0;j<n;j++){
            sum = sum + nums[j];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxsum;
    }
}