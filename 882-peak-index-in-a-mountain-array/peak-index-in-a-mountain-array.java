class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr[mid] >arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                start = mid +1;
            }
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return -1;
    }
}