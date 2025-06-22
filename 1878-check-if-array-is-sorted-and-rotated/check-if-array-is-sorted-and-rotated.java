class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int irr = 0;
        for(int i =0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                irr++;
            }
        }
        if(irr>1){
            return false;

        }
        return true;
        
        
           }
}