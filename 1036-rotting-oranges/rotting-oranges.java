class Solution {

    class Pair{
        int row;
        int col;
        int time;
        Pair(int row,int col,int time){
            this.row = row;
            this.col = col;
            this.time = time;

        }
    }
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair> queue = new LinkedList<>();
        int maxtime = 0;

        int freshOranges = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                }
                else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }

            
        }

        if(freshOranges == 0){
                return 0;
            }

        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};

        while(!queue.isEmpty()){
            Pair a = queue.poll();
            int rr = a.row;
            int cc = a.col;
            int t = a.time;

            maxtime = Math.max(t,maxtime);


            for(int k = 0;k<4;k++){
               int r = rr+rows[k];
               int c = cc+cols[k];

                if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c] == 1){
                    grid[r][c] = 2; 
                    queue.add(new Pair(r,c,t+1));
                    freshOranges--;
                }
            }
        }

        if(freshOranges == 0){
            return maxtime;
        }
        return -1;

    }

    
}