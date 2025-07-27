class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int start = 0;
        int end = 1;

        // Exponentially find the boundary
        while (end < nums.length && nums[end] < target) {
            start = end;
            end = 2 * end;
        }

        // Ensure end is within bounds
        end = Math.min(end, nums.length - 1);

        return binSearch(nums, start, end, target);
    }

    public int binSearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
