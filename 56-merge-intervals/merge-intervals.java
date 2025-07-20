class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        ArrayList<int[]> arr = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int[] curry = intervals[0];

        for(int i =1;i<intervals.length;i++){
            int[] next = intervals[i];

            if(curry[1] >= next[0]){
                curry[1] = Math.max(curry[1],next[1]);
            }
            else{
                arr.add(curry);
                curry = next;
            }
        }
        arr.add(curry);
        return arr.toArray(new int[arr.size()][]);

    }
}