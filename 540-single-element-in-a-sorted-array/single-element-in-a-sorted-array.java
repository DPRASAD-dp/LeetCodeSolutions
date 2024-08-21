class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Boundary checks for accessing nums[mid-1] and nums[mid+1]
            boolean isLeftValid = (mid - 1 >= 0);
            boolean isRightValid = (mid + 1 < nums.length);

            // Check if mid is the single non-duplicate element
            if ((!isLeftValid || nums[mid] != nums[mid - 1]) && (!isRightValid || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }

            // Determine which side to search
            if (isRightValid && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    start = mid + 1;  // Move to the right half if mid is even
                } else {
                    end = mid - 1;    // Move to the left half if mid is odd
                }
            } else if (isLeftValid && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    end = mid - 1;    // Move to the left half if mid is even
                } else {
                    start = mid + 1;  // Move to the right half if mid is odd
                }
            }
        }

        return -1;  // This should not be reached if the input array is valid
    }
}
