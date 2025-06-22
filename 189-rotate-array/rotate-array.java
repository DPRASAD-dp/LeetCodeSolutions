class Solution {
    public void rotate(int[] nums, int k) {

        
        int n = nums.length;
        if(n ==1){
            return;
        }
          k = k % n;
        reverse(0,n-1,nums,n);
        if (k > 0) {
    reverse(0, k - 1, nums,n);
}
        
        reverse(k,n-1,nums,n);

        
    }

    public void reverse(int a,int b,int[] nums,int n){
        for (int i = a; i <= (a + b) / 2; i++) {
    int temp = nums[i];
    nums[i] = nums[b - (i - a)];
    nums[b - (i - a)] = temp;
}

    }
}