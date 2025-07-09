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
    int maxsum  = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxsum;
    }
    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left =helper(node.left);
        int right = helper(node.right);

        maxsum = Math.max(maxsum,left+right+node.val);

        return Math.max(Math.max(left,right)+node.val,0);
    }
}