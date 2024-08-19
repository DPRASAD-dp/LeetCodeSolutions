class Solution {
    public boolean search(int[] nums, int target) {
        int[] newarr = removeDuplicates(nums);
        Arrays.sort(newarr);
        int start = 0;
        int end = newarr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            
            if (newarr[mid] == target) {
                return true;
            }
            
            
            if (newarr[start] <= newarr[mid]) { 
                if (target >= newarr[start] && target < newarr[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            } else { 
                if (target > newarr[mid] && target <= newarr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1; 
                }
            }
        }
        return false;

        
    }
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int[] uniqueNums = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueNums[index++] = num;
        }
        
        return uniqueNums;
    }
}