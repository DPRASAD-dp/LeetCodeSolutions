class Solution {
    public int maxSum(int[][] grid) {
         int maxSum = Integer.MIN_VALUE;
        
        // Loop through the grid to find hourglasses
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                // Calculate the sum of the current hourglass
                int currentSum = grid[i][j] + grid[i][j+1] + grid[i][j+2]
                               + grid[i+1][j+1] 
                               + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                
                // Update the maximum sum found so far
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}