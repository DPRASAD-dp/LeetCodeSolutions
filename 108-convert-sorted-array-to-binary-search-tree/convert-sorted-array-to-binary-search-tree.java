/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums);
    }

    public TreeNode helper(int[] nums){
        if(nums.length == 0){
            return null;
        }
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(Arrays.copyOfRange(nums,0,mid));
        root.right = helper(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;
    }
}