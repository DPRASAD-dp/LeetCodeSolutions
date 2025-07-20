class Solution {
    public int subarraySum(int[] nums, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum == k){
                count++;
            }
            int prefix = sum-k;
            int a = map.getOrDefault(prefix,Integer.MIN_VALUE);
            if(a != Integer.MIN_VALUE){
                count+=a;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    
    }
}