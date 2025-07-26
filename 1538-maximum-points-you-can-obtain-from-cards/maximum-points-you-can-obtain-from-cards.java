class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total =0;
        int maxsum =0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        if(k==n) return total;
        int sum =0;
        for(int i=0;i<n-k;i++){
            sum+=cardPoints[i];
        }
        maxsum = sum;
        int j =0;
        int a = n-k;
        while(j<n && a<n){
            sum-=cardPoints[j];
            sum+=cardPoints[a];
            maxsum = Math.min(maxsum,sum);
            a++;
            j++;
        }

        return total-maxsum;
    }
}