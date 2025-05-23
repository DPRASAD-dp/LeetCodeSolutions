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

        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);
        return (level(root,xx,0)==level(root,yy,0) && !isSibling(root,xx,yy));
        
    }

    TreeNode findNode(TreeNode root,int x){
        if(root == null){
            return null;
        }
        if(root.val == x){
            return root;
        }

        TreeNode n = findNode(root.left,x);

        if(n!= null){
            return n;
        }
        
            return findNode(root.right,x);
        


    }

    int level(TreeNode root,TreeNode xx,int a){
        if(root == null){
            return 0;
        }

        if(root.val == xx.val){
            return a;
        }

        int n = level(root.left,xx,a+1);
        if(n!=0){
            return n;
        }
        return level(root.right,xx,a+1);
    }


    boolean isSibling(TreeNode root,TreeNode xx,TreeNode yy){
        if(root == null){
            return false;
        }

        return (root.right == xx && root.left == yy) || (root.right == yy && root.left == xx) || isSibling(root.right,xx,yy) || isSibling(root.left,xx,yy);
    }


}