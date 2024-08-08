class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count   = 0;
        int countbackup = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            countbackup = Math.max(count,countbackup);
        }
        return countbackup;
        
    }
}