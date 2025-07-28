class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;

        // Check if array is already sorted
        if (nums[0] < nums[nums.length - 1]) {
            return binsearch(0, nums.length - 1, nums, target) != -1;
        }

        int pivot = findPivot(nums);

        if (pivot != -1 && nums[pivot] == target) {
            return true;
        }

        if (pivot == -1) {
            return binsearch(0, nums.length - 1, nums, target) != -1;
        }

        if (target >= nums[0]) {
            return binsearch(0, pivot, nums, target) != -1;
        } else {
            return binsearch(pivot + 1, nums.length - 1, nums, target) != -1;
        }
    }

    public int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // Shrink the bounds
                if (start < nums.length - 1 && nums[start] > nums[start + 1]) return start;
                start++;

                if (end > 0 && nums[end - 1] > nums[end]) return end - 1;
                end--;
            }
            // Left half is sorted
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
            // Right half is sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int binsearch(int start, int end, int[] nums, int target) {
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
