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
    int dia  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return dia;
    }

    int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int rightheight = 0;
        int leftheight = 0;

        if(node.left != null){
        leftheight = helper(node.left);
        }
        if(node.right != null){
        rightheight = helper(node.right);
        }

        int nodedia = rightheight+leftheight;
        dia = Math.max(nodedia,dia);

        int height = Math.max(leftheight,rightheight)+1;
        return height;



    }
}