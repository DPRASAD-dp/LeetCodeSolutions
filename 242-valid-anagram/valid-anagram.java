class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            alpha[arr1[i]-'a']++;
        }
        for(int i=0;i<t.length();i++){
            alpha[arr2[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            if(alpha[i]!=0){
                return false;
            }
        }
        return true;
    }
}