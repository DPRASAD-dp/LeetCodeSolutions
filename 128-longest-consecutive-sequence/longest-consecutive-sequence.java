class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxcount =0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i : set){
            if(!set.contains(i-1)){
            int curr = i;
            int count = 1;
            while(set.contains(curr+1)){
                curr++;
                count++;
            }

            maxcount = Math.max(maxcount,count);
        }
        }
        return maxcount;
    }
}