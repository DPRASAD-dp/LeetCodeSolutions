import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i =1;i<n;i++){
        if(nums[i] > arr.get(arr.size()-1)){
            arr.add(nums[i]);
        }
        else{
            bin_search(i,nums,arr);
        }

        }

        return arr.size();
        
    }

    public void bin_search(int i,int[] nums,ArrayList<Integer> arr){
        
        int start  = 0;
        int end = arr.size()-1;

        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr.get(mid) == nums[i]){
                return;
            }
            else if(arr.get(mid) > nums[i]){
                end = mid-1;
                
            }
            else{
                start = mid+1;
            }

            }
            arr.set(start,nums[i]);
            

        }
    }