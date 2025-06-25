class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        int[] current = intervals[0];
        for(int i =0;i<n;i++){
            int[] next = intervals[i];
            if(current[1] >= next[0] ){
                current[1] =Math.max(current[1],next[1]);
            }
            else{
                list.add(current);
                current = next;
            }

        }
        list.add(current);
        int[][] ans =   list.toArray(new int[list.size()][]);

        return ans;
    }
}