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
    public int maxdi = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findheight(root);
        return maxdi;   
    }

    public int findheight(TreeNode node){
        if(node == null){
            return 0;
        }

        int rightheight = findheight(node.right);
        int leftheight = findheight(node.left);

        maxdi = Math.max(maxdi,rightheight+leftheight);
        return Math.max(rightheight,leftheight)+1;


    }
}