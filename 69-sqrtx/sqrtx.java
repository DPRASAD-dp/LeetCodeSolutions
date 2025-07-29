class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int root =0;

        while(start<=end){
            int mid =(end -start)/2 + start;
            long sqr = (long) mid*mid;
            if(sqr == x){
                root = mid;
                break;
            }
            if(sqr< x){
                root = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return root;

    }
}