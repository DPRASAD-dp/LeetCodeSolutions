class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == ""){
                continue;
            }
            str.append(arr[i]);
            if(i!= 0 ){
                str.append(" ");
            }
        }
        return str.toString().trim();
    }
}