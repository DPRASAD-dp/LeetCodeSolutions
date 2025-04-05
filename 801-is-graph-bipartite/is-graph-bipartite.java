import java.util.*;
class Pair{
    int node;
    int color;

    Pair(int node,int color){
        this.node = node;
        this.color = color;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int colors[]  = new int[graph.length];
        Arrays.fill(colors,-1);

        for(int i = 0 ; i< graph.length;i++){
            if(colors[i] == -1){

                if(!bfs(i,graph,colors)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean bfs(int i , int[][] graph,int[] colors){
        
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i,0));
        while(!queue.isEmpty()){
        
            Pair a  = queue.poll();
            int n = a.node;
            int c = a.color;
            colors[n] = c;
            for(int j : graph[n]){
                if(colors[j] == -1){
                queue.add(new Pair(j, 1 - c));
                } else if(colors[j] == c){
                    return false;
                }
            }
        }
        return true;
    }
}