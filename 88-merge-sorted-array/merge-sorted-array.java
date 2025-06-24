import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int total = m + n;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                // Shift elements to the right to make space
                for (int k = total - 1; k > i; k--) {
                    nums1[k] = nums1[k - 1];
                }

                nums1[i] = nums2[j];
                i++;
                j++;
                m++; 
            }
        }

        
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
