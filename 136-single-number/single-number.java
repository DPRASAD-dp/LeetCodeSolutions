class Solution {
    public int singleNumber(int[] nums) {
       
        int n = nums.length;
        int ans = 0;
        for(int i =0;i<=n-1;i++){   
            ans = ans ^ nums[i];   
    }
    return ans;
}}