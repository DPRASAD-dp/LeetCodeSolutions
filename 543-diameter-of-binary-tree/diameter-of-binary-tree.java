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
    int maxdiameter  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        cal_height(root);
        return maxdiameter-1;
    }
    public int cal_height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftheight = cal_height(root.left);
        int rightheight = cal_height(root.right);

        int dia = leftheight+rightheight+1;
        maxdiameter = Math.max(dia,maxdiameter);
        return Math.max(leftheight,rightheight)+1;    }
}