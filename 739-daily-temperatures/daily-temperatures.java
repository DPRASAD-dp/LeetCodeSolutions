class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        

        for(int i = temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                arr[i] = stack.peek()  - i;
            }
            else{
                arr[i] = 0;
            }
            
                stack.push(i);
            }
            return arr;

    }
        
    }
