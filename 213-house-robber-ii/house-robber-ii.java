class Solution {
    public int rob(int[] nums) {

        if(nums.length ==1){
            return nums[0];
        }

        int n = nums.length;
        int[] arr= new int[n];
        Arrays.fill(arr,-1);
        int ans1 = callhelper(nums,arr,0,n-1);
        Arrays.fill(arr,-1);
        int ans2 = callhelper(nums,arr,1,n);

       return Math.max(ans1,ans2);


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