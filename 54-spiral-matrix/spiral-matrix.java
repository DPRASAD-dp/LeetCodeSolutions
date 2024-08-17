class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse the top row from left to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++; // Move the top boundary down

            // Traverse the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            if (top <= bottom) { // Check if there is still a bottom row to process
                // Traverse the bottom row from right to left
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }

            if (left <= right) { // Check if there is still a left column to process
                // Traverse the left column from bottom to top
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
        }

        return list;
    }
}
