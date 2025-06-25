class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int a =-1;
        int b =-1;
        for(int i =n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                a = i;
                break;
            }
        }
        if(a== -1){
            reverseSubarray(nums,0,n-1);
            return;
        }
        for(int j =n-1;j>=0;j--){
            if(nums[a]<nums[j]){
                b=j;
                break;
            }
        }
        

        swap(a,b,nums);
        reverseSubarray(nums,a+1,n-1);
       
    }

    public void swap(int a,int b,int[] nums){
        int temp =nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void reverseSubarray(int[] arr, int startIndex, int endIndex) {
    
        if (arr == null || startIndex < 0 || endIndex >= arr.length || startIndex >= endIndex) {
            return; 
        }

        int left = startIndex;
        int right = endIndex;

        while (left < right) {
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            
            left++;
            right--;
        }
    }
}