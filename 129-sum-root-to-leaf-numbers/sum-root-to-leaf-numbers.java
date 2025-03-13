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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode node,int num){
        if(node == null){
            return num;
        }
        num = num*10 + node.val;
        if(node.left == null && node.right == null){
            return num;
        }

        int left = helper(node.left,num);
        int right = helper(node.right,num);

        if(node.right == null){
            return left;
        }
        if(node.left == null){
            return right;
        }
        return left+right;
    }
}