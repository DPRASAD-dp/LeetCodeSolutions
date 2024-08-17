class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int currsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n : nums){
            currsum = currsum+n;
            int diff = currsum - k;
            result = result + map.getOrDefault(diff,0);
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return result;
    }
}