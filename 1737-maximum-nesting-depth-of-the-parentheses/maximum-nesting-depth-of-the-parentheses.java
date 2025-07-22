class Solution {
    public int maxDepth(String s) {
        int maxcount =0;
        int count =0;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
                count = stk.size();
                maxcount = Math.max(count,maxcount);
                
            }
            else if (s.charAt(i) == ')'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
        }
        return maxcount;
    }
}