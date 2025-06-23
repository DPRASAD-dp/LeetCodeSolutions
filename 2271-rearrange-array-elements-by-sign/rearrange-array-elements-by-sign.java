class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int[] pos = new int[n];
        int[] neg = new int[n];

        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                pos[a]= nums[i];
                a++;
            }
            else{
                neg[b] = nums[i];
                b++;
            }
        }

        int j = 0;
        int k =0;
       
        for(int i =0;i<nums.length;i++){
           if(i%2 == 0){
            nums[i] = pos[k];
            k++;
           } 
           else{
            nums[i] = neg[j];
            j++;
           }
        }

        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
        return nums;
    }
}