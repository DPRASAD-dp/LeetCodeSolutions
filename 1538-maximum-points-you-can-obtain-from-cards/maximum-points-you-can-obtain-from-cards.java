class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total =0;
        int minsum =Integer.MAX_VALUE;
        int maxsum =0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
         int j =0;
        while(k>=0){
        int sum =0;
        for(int i=j;i<n-k;i++){
            sum+=cardPoints[i];
        }
        j++;
        minsum = Math.min(minsum,sum);
        k--;}
        maxsum = total-minsum;
        return maxsum;
    }
}