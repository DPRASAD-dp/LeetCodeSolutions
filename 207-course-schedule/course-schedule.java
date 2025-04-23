class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
         ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> arr = new LinkedList<>();
        int[] indegree = new int[n + 1];

        // Step 1: Build the graph and calculate indegree
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites) {
            int u = edge[1];
            int d = edge[0];
            graph.get(u).add(d);
            indegree[d]++;
        }

        // Step 2: Start BFS for nodes with indegree 0
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                arr.add(i);
            }
        }

        bfs(graph, arr, indegree, ans);

        
        return ans.size() == n;
    }

    // BFS method to perform the topological sort
    public static void bfs(ArrayList<ArrayList<Integer>> graph, Queue<Integer> arr, int[] indegree, ArrayList<Integer> ans) {
        while (!arr.isEmpty()) {
            int a = arr.poll();
            ans.add(a);

            for (int neighbor : graph.get(a)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    arr.add(neighbor);
                }
            }
        }


        
    }
}