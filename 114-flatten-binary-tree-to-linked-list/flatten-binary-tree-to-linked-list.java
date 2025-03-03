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
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();

        if(root != null && root.right == null && root.left == null){
            return;
        }
        preorder(root,list);
        TreeNode temp = root;

        for(int i = 0;i<list.size();i++){
            temp.right = list.get(i);
            temp.left = null;
            temp = temp.right;

        }
    }

    public void preorder(TreeNode node,LinkedList<TreeNode>list ){
        if(node == null){
            return;
        }
        list.add(node);
        preorder(node.left,list);
        preorder(node.right,list);
    }

}