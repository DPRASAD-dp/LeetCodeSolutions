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
    int depth  = 0;
    public int maxDepth(TreeNode root) {
        helper(root,1);
        return depth;
    }

    int helper(TreeNode node,int h){
        if(node == null){
            return h;
        }

        depth = Math.max(h,depth);

        if(node.left != null){
            helper(node.left,h+1);
        }

        if(node.right != null){
            helper(node.right,h+1);
        }

          return h;

    }
}