class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if((end+1)<=nums.length-1){
            return end+1;
        }
        else{
            return end+1;
        }

    }
}