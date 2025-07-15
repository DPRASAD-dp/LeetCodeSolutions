class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && height[s.peek()] <= height[i] ){
               int bottom =  s.pop();
               if(s.isEmpty()){
                break;
               }
               int left = s.peek();
               int hei = Math.min(height[left],height[i]) - height[bottom];
               int distance = i - left -1;
               int water = distance*hei;
               ans+=water;
            }


            s.push(i);
        }
        return ans;
    }
}