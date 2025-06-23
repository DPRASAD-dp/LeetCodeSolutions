class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count1 =0;
        int count2 =0;
        int count3 =0;

        for(int i =0;i<n;i++){
            if(nums[i] == 0){
                count1++;
                            }
            if(nums[i] == 1){
                count2++;
            }
            else{
                count3++;
            }
        }

        for(int i =0;i<n;i++){
            if(i<count1){
                nums[i] =0;
            }
            if(i>=count1 && i<count1+count2){
                nums[i] =1;
            }
            if(i>=count1+count2){
                nums[i] =2;
            }
        }
    }
}