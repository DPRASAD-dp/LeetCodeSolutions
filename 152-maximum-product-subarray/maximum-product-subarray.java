class Solution {
    public int maxProduct(int[] nums) {
        // Initialize variables to store the maximum and minimum product up to the current element.
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current number is negative, swap maxProduct and minProduct
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
