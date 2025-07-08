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
    public int maxDepth(TreeNode root) {
        return cal_height(root);
    }
     public int cal_height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftheight = cal_height(root.left);
        int rightheight = cal_height(root.right);
        return Math.max(leftheight,rightheight)+1;    
        }
}
