class Solution {
    public int majorityElement(int[] nums) {
        int count  = 0;
        int length = nums.length/2;
        int element = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i] == element ){
                count++;
            }
            else{
                count--;
                if(count ==0){
                    element = nums[i];
                    count++;
                }
            }
        }

        
            return element;
        
    }
}