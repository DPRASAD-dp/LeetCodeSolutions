class Solution {
    public boolean canChange(String start, String target) {
        // If the counts of 'L' and 'R' are not the same in both strings, return false
        if (start.replace("_", "").equals(target.replace("_", "")) == false) {
            return false;
        }
        
        int n = start.length();
        
        // Iterate through both strings and check if the movement of each 'L' and 'R' is possible
        for (int i = 0, j = 0; i < n; i++) {
            // Skip the underscores and move to the next valid character
            if (start.charAt(i) == '_') continue;
            while (j < n && target.charAt(j) == '_') j++;
            
            // If there is no corresponding character in target or they are different, return false
            if (j >= n || start.charAt(i) != target.charAt(j)) return false;
            
            // Check movement validity:
            if (start.charAt(i) == 'L' && i < j) {
                return false;  // 'L' cannot move to the right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false;  // 'R' cannot move to the left
            }
            j++;  // Move to the next character in target
        }
        
        return true;
    }
}
