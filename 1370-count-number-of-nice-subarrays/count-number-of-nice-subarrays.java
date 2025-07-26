class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        int result =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<n;i++){
            if(nums[i]%2!=0){
                count++;
            }
            if(map.containsKey(count-k)){
                result+=map.get(count-k);
            }
            map.put(count,map.getOrDefault(count,0)+1);
        }
    return result;
}}