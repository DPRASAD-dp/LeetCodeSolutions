class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0) {
                bfs(i, j, grid, visited);
                count++;
}
            }
        }

        return count;
        
    }


    int[] row = {-1,+1,0,0};
    int[] col = {0,0,+1,-1};

    public void bfs(int i,int j,char[][] grid,int[][] visited){

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while(!queue.isEmpty()){
            int[] ar = queue.poll();
            int q = ar[0];
            int w = ar[1];
            for(int k= 0;k<4;k++){
                int rows = q+row[k];
                int cols = w+col[k];

                if(rows>=0 && rows<grid.length && cols >=0 && cols<grid[0].length && visited[rows][cols] == 0){
                    if(grid[rows][cols] == '1'){
                        visited[rows][cols] = 1;
                        queue.add(new int[]{rows,cols});
                    }
                    else{
                        visited[rows][cols] = 1;
                    }
                }
            }
        }

    }
}