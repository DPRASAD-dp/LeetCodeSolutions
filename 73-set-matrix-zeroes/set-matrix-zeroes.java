class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    list.add(pair);
                }
            }
        }

        for(int i =0;i<list.size();i++){
            makerowzeros(list.get(i).get(0),matrix,m,n);
            makecolumnzeros(list.get(i).get(1),matrix,m,n);
        }

        
    }

    public static void makecolumnzeros(Integer i,int[][] matrix,int m,int n){
        
            for(int k = 0;k<m;k++){
                matrix[k][i] = 0;
                            }
        }
    

    public static void makerowzeros(int i,int[][] matrix,int m,int n){
        for(int k = 0;k<n;k++){
                matrix[i][k] = 0;
                            }

    }
}