import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        // Create a list to store the coordinates of the zeros
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();

        // Traverse the matrix to find all zero elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    // Store the coordinates (i, j) of the zero element
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(i); // row index
                    arr.add(j); // column index
                    aList.add(arr);
                }
            }
        }

        // Set the respective rows and columns to Integer.MIN_VALUE (temporary marker)
        for (ArrayList<Integer> arr : aList) {
            // Get the row and column indices
            int row = arr.get(0);
            int col = arr.get(1);

            // Set the respective row and column to Integer.MIN_VALUE
            setzerofunctionrow(row, col, matrix);
            setzerofunctioncolumn(row, col, matrix);
        }

        
    }

    // Function to set the entire row to Integer.MIN_VALUE
    public static void setzerofunctionrow(int row, int col, int[][] matrix) {
        for (int u = 0; u < matrix[row].length; u++) {
             // Avoid overwriting already existing 0s
                matrix[row][u] = 0;
            
        }
    }

    // Function to set the entire column to Integer.MIN_VALUE
    public static void setzerofunctioncolumn(int row, int col, int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
             // Avoid overwriting already existing 0s
                matrix[k][col] = 0;
            
        }
    }
}
