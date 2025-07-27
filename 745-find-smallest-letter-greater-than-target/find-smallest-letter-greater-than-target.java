class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start  = 0;
        int end = letters.length-1;
        int ans = -1;
        if(target>=letters[end]) return letters[0];
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(letters[mid] <= target){
                start = mid+1;
            }
            if(letters[mid]>target){
                end = mid-1;
            }
            
        }
        return letters[start];
    }
}