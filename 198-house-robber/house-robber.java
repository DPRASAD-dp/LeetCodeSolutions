class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n];
        Arrays.fill(arr,-1);
        return callhelper(nums,arr,0,n);
    }

    int callhelper(int[] nums,int[] arr,int a,int n){

        if(a>=n){
            return 0;
        }
        if(arr[a] != -1){
            return arr[a];
        }
        int choice1 = nums[a] + callhelper(nums,arr,a+2,n);
        int choice2 = callhelper(nums,arr,a+1,n);

        int finalmax = Math.max(choice1,choice2);
        arr[a] = finalmax;
        return finalmax;



    }


}