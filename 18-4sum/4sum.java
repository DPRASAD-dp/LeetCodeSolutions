class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i =0;
        while(i<n){
            int j = i+1;
            int a = nums[i];
            while(j<n){
                int b = nums[j];
                int k = j+1;
                int l = n-1;
                while(k<l){
                int c = nums[k];
                int d = nums[l];
                 long sum = (long) a + b + c + d;
                if(sum == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    list.add(d);
                    ans.add(list);
                    while(k<n && nums[k] == c){k++;}
                    while(l>0 && nums[l] == d){l--;}
                }
                else if(sum<target){
                    while(k<n && nums[k] == c){k++;}
                }
                else{
                     while(l>0 && nums[l] == d){l--;}
                }}
                 while(j<n && nums[j] == b){j++;}
            }
            while(i<n && nums[i] == a){i++;}

        }
        return ans;
    }
}