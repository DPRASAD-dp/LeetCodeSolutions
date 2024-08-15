import java.util.ArrayList;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arrp = new ArrayList<>();
        ArrayList<Integer> arrn = new ArrayList<>();
        
  
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                arrp.add(nums[i]);
            } else {
                arrn.add(nums[i]);
            }
        }
        
        int[] arr = new int[n];
        int count = 0;
        int p=0;
        int q=0;
        for(int j = 0; j < n; j++){
            if(count % 2 == 0){
                arr[j] = arrp.get(p++);
            } else {
                arr[j] = arrn.get(q++);
            }
            count++;
        }
        
        return arr;
    }
}
