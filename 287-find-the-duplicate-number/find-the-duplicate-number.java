class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =1;i<n;i++){
            if(nums[i-1] == nums[i]){
                return nums[i];
            }
        }

        return -1;
    }
}