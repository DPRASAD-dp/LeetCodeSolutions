class Solution {
    public int maxProduct(int[] nums) {
        int minprod = nums[0];
        int maxprod = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = minprod;
                minprod = maxprod;
                maxprod = temp;
            }

            minprod = Math.min(nums[i],nums[i]*minprod);
            maxprod = Math.max(nums[i],nums[i]*maxprod);

            result = Math.max(result,maxprod);
        }
        return result;
    }
}