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
    public boolean isCousins(TreeNode root, int x, int y) {
        return (level(x,root,0) == level(y,root,0)) && (!(sibling(x,y,root)));
    }

    public int level(int x,TreeNode root,int level){
        if(root == null){
            return -1;
        }
        if(root.val == x){
            return level;
        }
        int  left =  level(x,root.left,level+1);
        if(left != -1){
            return left;        }
        
        int right = level(x,root.right,level+1);
        return right;
    }

    public boolean sibling(int x,int y,TreeNode root){
        if(root == null){
            return false;
        }
        if(root.right!=null && root.left!= null){
        if((root.right.val == x && root.left.val == y )|| (root.left.val == x && root.right.val == y )){
            return true;
        }}

        return  sibling(x,y,root.left) || sibling(x,y,root.right);
    }



}