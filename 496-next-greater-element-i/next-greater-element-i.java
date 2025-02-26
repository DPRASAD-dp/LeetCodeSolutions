class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            arr[i] = nextGreater(nums1[i],nums2);
        }
        return arr;
        
    }

    public int nextGreater(int a , int[] b){
        int max = -1;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<b.length;i++){
            stack.push(b[i]);
        }

        while(!stack.isEmpty()){
            int str = stack.pop();
            if(str== a)
            return max;
            else if(str > a){
                max = str;
            }

        }
        return max;
    }
}