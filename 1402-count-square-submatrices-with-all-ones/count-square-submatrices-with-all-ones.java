import java.util.*;
class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if( i ==0 || j == 0){
                    dp[i][j] = matrix[i][j];
                }
                else if(matrix[i][j] == 1){
                    dp[i][j] = 1+ Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
                else{
                    dp[i][j] = 0;
                }

            }
        }
        int result = 0;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                result = result+ dp[i][j];
            }
        }
        return result;
    }
}