class Solution {
    public String removeDuplicates(String s) {
        String str = "";
        Stack<Character>stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0;i< arr.length;i++){
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
            else{
                stack.pop();
            }

        }
        while(!stack.isEmpty()){
            str = stack.pop() + str;        }
            return str;
    }
}