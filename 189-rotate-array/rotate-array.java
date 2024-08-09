class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         int[] temp = nums.clone();
        
        for(int j = 0;j<n;j++){
            nums[(j+k)%n] = temp[j];
        }
    }
}