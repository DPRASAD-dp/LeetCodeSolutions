class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            boolean isLeftValid = (mid - 1 >= 0);
            boolean isRightValid = (mid + 1 < nums.length);

            if ((!isLeftValid || nums[mid] != nums[mid - 1]) && (!isRightValid || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }

            if (isRightValid && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    start = mid + 1;  
                } else {
                    end = mid - 1;   
                }
            } else if (isLeftValid && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    end = mid - 1;   
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;  
    }
}
