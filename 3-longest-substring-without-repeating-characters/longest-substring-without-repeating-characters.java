class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int n = s.length();
        int maxi =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j =0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                int k = map.get(s.charAt(j));
                if(k>=i){
                i =k+1;}
            }
            map.put(s.charAt(j),j);
            maxi = Math.max(maxi,j-i+1);
        }
        return maxi;
    }
}