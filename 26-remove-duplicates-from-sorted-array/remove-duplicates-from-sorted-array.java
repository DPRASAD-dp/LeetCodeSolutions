class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if(n==1){
            return 1;
        }
        int j =0;
        for(int i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i =0;i<j;i++){
            if(nums[i] == nums[n-1]){
            return j;}            
            }
        
        nums[j] = nums[n-1];
        return ++j;
    }
}