class Solution {
    public String firstPalindrome(String[] words) {
        // Iterate over each word in the array
        for (String word : words) {
            // Check if the word is a palindrome by comparing it with its reverse
            if (isPalindrome(word)) {
                return word; // Return the first palindrome found
            }
        }
        return ""; // Return empty string if no palindrome is found
    }
    
    // Helper method to check if a word is a palindrome
    private boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        
        // Compare characters from both ends towards the center
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // Return false if characters do not match
            }
            left++;
            right--;
        }
        return true; // Return true if the word is a palindrome
    }
}
