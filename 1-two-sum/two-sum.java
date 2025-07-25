class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int k = nums[i];
            if(map.containsKey(target-k)){
                return new int[]{map.get(target-k),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}