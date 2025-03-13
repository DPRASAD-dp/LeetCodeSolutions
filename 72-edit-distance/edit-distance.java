class Solution {
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] cache = new int[n1][n2];
         for (int[] row: cache) {
            Arrays.fill(row, -1);
        }
        return helper(0,n1,word1,0,n2,word2,cache);
    }
    int helper(int index1,int n1,String word1,int index2,int n2,String word2,int[][] cache){

        if(index1 == n1){
            return n2-index2;
        }
        if(index2 == n2){
            return n1-index1;
        }

        if(cache[index1][index2] != -1){
            return cache[index1][index2];
        }
        int result = -1;
        if(word1.charAt(index1) == word2.charAt(index2)){
            result = helper(index1+1,n1,word1,index2+1,n2,word2,cache);
        }
        else{

            int choice1 = 1+ helper(index1+1,n1,word1,index2,n2,word2,cache);
            int choice2 = 1+ helper(index1,n1,word1,index2+1,n2,word2,cache);
            int choice3  = 1+ helper(index1+1,n1,word1,index2+1,n2,word2,cache);

            result = Math.min(Math.min(choice1,choice2),choice3);

        }
        cache[index1][index2] = result;
        return result;
    }
}