class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (end- start)/2 + start;
            if(nums[mid] == target){
                last = mid;
                start = mid+1;

            }
            if(nums[mid]<target){
                start = mid+1;            }
            if(nums[mid]>target){
                end = mid-1;            }
        }

        start = 0;
        end = nums.length-1;

        while(start<=end){
            int mid = (end- start)/2 + start;
            if(nums[mid] == target){
            first  = mid;
                end = mid-1;

            }
            if(nums[mid]>target){
                end = mid-1;
            }

            if(nums[mid]<target){
                start = mid+1;            }
        }

        return new int[]{first,last};
    }
}