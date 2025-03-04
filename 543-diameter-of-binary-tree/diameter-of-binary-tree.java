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
    int maxdi = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diacal(root);
        return maxdi;
        
    }

    public int diacal(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int rightheight = diacal(node.right);
        int leftheight = diacal(node.left);
        

        maxdi = Math.max(maxdi,(leftheight+rightheight));


        return Math.max(leftheight,rightheight)+1;
    }
}