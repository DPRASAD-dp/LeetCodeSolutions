class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
        if(nums[i] == 0 && i != n-1){
            swapwith(nums,i,n);
        }
        }
}

    public void swapwith(int[] nums,int a,int n){
        for(int i =a+1;i<n;i++){
            if(nums[i] != 0){
                nums[a] = nums[i];
                nums[i] = 0;
                return;
            }
        }
    }
}