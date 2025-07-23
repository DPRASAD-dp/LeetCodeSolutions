class Solution {
    public int beautySum(String s) {
        int ans =0;
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            int[] alpha = new int[26];
            alpha[s.charAt(i) - 'a']++;
            for(int j =i+1;j<n;j++){
                char ch1 = s.charAt(j);
                alpha[s.charAt(j) - 'a']++;
                int maxi = 0;
                int mini = Integer.MAX_VALUE;
                for(int k =0;k<26;k++){
                    if (alpha[k] > 0) {
                maxi = Math.max(maxi, alpha[k]);
                mini = Math.min(mini, alpha[k]);
    }
                }
                ans= ans+(maxi-mini);
            }

        }
        return ans;
    }
}