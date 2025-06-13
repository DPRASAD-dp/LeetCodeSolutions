import java.util.*;
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return edit_distance(0,0,word1,word2,m,n,dp);
    }

    public int edit_distance(int i ,int j,String word1, String word2,int m , int n,int[][] dp){
        if(i == m) return n - j; 
        if(j == n) return m - i; 


        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int insertdist = 0;
        int deletedist = 0;
        int replacedist = 0;

        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = edit_distance(i + 1, j + 1, word1, word2, m, n, dp);
        }

        else{

        insertdist =  1 + edit_distance(i,j+1,word1,word2,m,n,dp);
        deletedist = 1 + edit_distance(i+1,j,word1,word2,m,n,dp);
        replacedist = 1+ edit_distance(i+1,j+1,word1,word2,m,n,dp);
        dp[i][j] = Math.min(insertdist,Math.min(deletedist,replacedist));
        }

        
        return dp[i][j];

    }

}