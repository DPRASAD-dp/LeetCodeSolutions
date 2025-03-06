class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] dependencies  = new int[numCourses];

        for(int  i = 0 ; i< numCourses ; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] course : prerequisites){
            graph.get(course[1]).add(course[0]);
            dependencies[course[0]]++;

        }

        Queue<Integer> queue = new LinkedList<>();

        for(int j = 0;j<numCourses;j++){

            if(dependencies[j] == 0){
                queue.add(j);
            }

        }

        int finalcomplete = 0;
        while(!queue.isEmpty()){
            int a = queue.poll();
            finalcomplete++;


            for(int c : graph.get(a)){
                dependencies[c]--;
                if(dependencies[c]==0){
                    queue.add(c);
                }
            }

        }
        if(finalcomplete == numCourses){
            return true;
        }
        else{
            return false;
        }
    }
}