class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(!stk.isEmpty()){
                    str.append(c);
                }
                stk.push(c);
            }
            else{
                stk.pop();
                if(!stk.isEmpty()){
                    str.append(c);
                }   
            }
        }
        return str.toString();
    }
}