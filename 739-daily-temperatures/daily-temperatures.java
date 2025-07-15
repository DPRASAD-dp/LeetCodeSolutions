class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        ans[n-1] = 0;
        s.push(n-1);
        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                ans[i] = s.peek() - i;
               }
               else{
                ans[i] = 0;
               }
            s.push(i);
        }
        return ans;
    }
}