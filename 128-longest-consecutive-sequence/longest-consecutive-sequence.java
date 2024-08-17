class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int m = nums.length;
        int count = 1;
        int maxcount = 1;
        Arrays.sort(nums);
        int a = removeduplicates(nums,m);
        
        for(int k =0;k<a-1;k++){
            if(nums[k] == (nums[k+1]-1)){
                count++;
            }
            
            else{
                
                count = 1;
            }
            maxcount = Math.max(count,maxcount);


        }
        return maxcount;
    }
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        // checking the last element present in temp[]
        boolean check = true;
        for (int i = 0; i < j; i++) {
            if (temp[i] == a[n - 1]) {
                check = false;
                break;
            }
        }

        if (check == true) {

            temp[j++] = a[n - 1];
        }
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
}