/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    int start = 0;
    int end = mountainArr.length()-1;
    int ans = -1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            int middi = mountainArr.get(mid);
            int middii = mountainArr.get(mid+1);
            int midd = mountainArr.get(mid-1);
            if(middi> middii && middi > midd){
                ans = mid;
                break;
            }
            if(middi<middii){
                start = mid +1;
            }
            if(middi> middii){
                end = mid;
            }
        }
        int a =  Math.min(binsearchinc(0,ans,target,mountainArr),binsearchdec(ans,mountainArr.length()-1,target,mountainArr));
        if(a == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return a;
        }
    }

    public int binsearchinc(int s,int e,int target,MountainArray mountainArr){
        while(s<=e){
            int mid = (e-s)/2 + s;
            int middi = mountainArr.get(mid);
            if(middi == target){
                return mid;
            }
            if(middi < target){
                s = mid +1;
            }
            if(middi>target){
                e = mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }

    public int binsearchdec(int s,int e,int target,MountainArray mountainArr){
        while(s<=e){
            int mid = (e-s)/2 + s;
            int middi = mountainArr.get(mid);
            if(middi == target){
                return mid;
            }
            if(middi > target){
                s = mid +1;
            }
            if(middi<target){
                e = mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }

}