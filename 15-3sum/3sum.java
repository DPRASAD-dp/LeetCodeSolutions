class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int i =0;
        while(i<n){
            int c = nums[i];
            int j = i+1;
            int k = n-1;
            while(j<k && k>=0 && j<n){
                int a = nums[j];
                int b = nums[k];
                int sum = a+b+c;
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                while (j < k && nums[j] == a) j++;
                while (j < k && nums[k] == b) k--;
                } else if (sum < 0) {
                    while (j < k && nums[j] == a) j++;
                } else {
                    while (j < k && nums[k] == b) k--;
                }

        }while (i < n && nums[i] == c) i++;
        }
        return ans;
    }
}