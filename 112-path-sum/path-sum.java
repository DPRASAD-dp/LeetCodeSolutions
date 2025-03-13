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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum);
    }

    boolean helper(TreeNode node,int targetSum){
        if(node == null){
            return false;
        }
        if(node.val == targetSum && node.left == null && node.right == null){
            return true;
        }

        return helper(node.right,targetSum - node.val) || helper(node.left,targetSum-node.val);

    }



}