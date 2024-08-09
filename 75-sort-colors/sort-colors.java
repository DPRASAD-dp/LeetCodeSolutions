class Solution {
    public void sortColors(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0; 
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count1++;
            }
            if(nums[i]==1){
                count2++;
            }
            if(nums[i]==2){
                count3++;
            }
        } 
        int index = 0;
        for(int j =0;j<nums.length;j++){
            if(j<count1){
                nums[index++] = 0;
            }
            else if((j>=count1) && j<(count1+count2)){
                nums[index++] = 1;
            }
            else{
                nums[index++] = 2;
            }
        }
    }
}