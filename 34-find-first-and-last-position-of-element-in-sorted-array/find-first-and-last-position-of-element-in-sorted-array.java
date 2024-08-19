class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = binaryhelp(nums,target,true);
        arr[1] = binaryhelp(nums,target,false);
        return arr;
    }
    public int binaryhelp(int[] nums,int target,boolean leftbias){
        int start =0;
        int end = nums.length-1;
        int i = -1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(nums[mid] == target){
                i=mid;
                if(leftbias){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        } 
        return i;
    }
}