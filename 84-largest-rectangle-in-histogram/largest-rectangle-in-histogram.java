class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;

        int[] rightSmaller = findRightSmaller(heights);
        int[] leftSmaller = findLeftSmaller(heights);


        for(int i = 0;i<heights.length;i++){
            int area = 0;
            int width = 1;
            int rightcont  = rightSmaller[i] - i - 1;
            int leftcont = i - leftSmaller[i] - 1;

            width = width + rightcont;
            width = width + leftcont;

            area = (width)*heights[i];
            if(area> max){
                max = area;
            }

        }
        return max;
        
    }

    public int[] findRightSmaller(int[] heights){
     
     int n = heights.length;
     int[] results = new int[n];
     Stack<Integer>stack = new Stack<>();
     Arrays.fill(results,n);
     for(int i=n-1;i>=0;i--){
     while(!stack.isEmpty() && heights[i]<= heights[stack.peek()]){
        stack.pop();
     }
     if(!stack.isEmpty() ){
        results[i] = stack.peek();
     }
     stack.push(i);

    }
    return results;
    }

    public int[] findLeftSmaller(int[] heights){
     
     int n = heights.length;
     int[] result = new int[n];
     Stack<Integer>stack = new Stack<>();
     Arrays.fill(result,-1);
     for(int i = 0;i<n;i++){
     while(!stack.isEmpty() && heights[i]<= heights[stack.peek()]){
        stack.pop();
     }
     if(!stack.isEmpty() ){
        result[i] = stack.peek() ;
     }
     stack.push(i);

    }
    return result;
    }
}