class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int start = 0;
        int end = 1;

        while (end < nums.length && nums[end] < target) {
            start = end;
            end = 2*end;
        }
        end  = Math.min(end,nums.length-1);

        return binSearch(nums, start, end, target);
    }

    public int binSearch(int[] nums, int start, int end, int target) {
        while (start <= end && end < nums.length) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
