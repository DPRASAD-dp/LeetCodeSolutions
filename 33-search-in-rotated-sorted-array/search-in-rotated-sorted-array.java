class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int ans = -1;
        if(pivot == -1){
            return binsearch(0,nums.length-1,nums,target);
        }
        else{
            ans = binsearch(0,pivot,nums,target);
            if(ans == -1){
                ans = binsearch(pivot+1,nums.length-1,nums,target);
            }
        }
        return ans;
    }

    public int findPivot(int[] nums){
        int end = nums.length-1;
        int start = 0;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(mid < nums.length - 1 &&  nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > 0  && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            }
            if(nums[mid]>nums[start]){
                start = mid+1;
            }
            
        }
        return -1;
    }

    public int binsearch(int s,int e,int[] nums,int target){
        while(s<=e){
            int m = (e-s)/2 + s;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] < target){
                s = m+1;
            }
            if(nums[m] > target){
                e = m-1;
            }
        }
        return -1;
    }
}