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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    TreeNode helper(TreeNode node){
        if(node == null){
            return null;
        }

        if(node.left != null){
            helper(node.left);
        }   

        if(node.right != null){
            helper(node.right);
        }   
        TreeNode righty  = node.right;

        node.right = node.left;
        node.left = righty;
        return node;
        
        }
}