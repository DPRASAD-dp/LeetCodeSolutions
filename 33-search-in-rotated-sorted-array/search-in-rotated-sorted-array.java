class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;

        // Optimization: already sorted
        if (nums[0] <= nums[nums.length - 1]) {
            return binsearch(0, nums.length - 1, nums, target);
        }

        int pivot = findPivot(nums);

        if (pivot != -1 && nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binsearch(0, pivot, nums, target);
        } else {
            return binsearch(pivot + 1, nums.length - 1, nums, target);
        }
    }

    public int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
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
