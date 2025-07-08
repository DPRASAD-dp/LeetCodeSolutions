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
    public List<Integer> rightSideView(TreeNode root) {
     if(root == null){
            return  new ArrayList<>();
        }
        List<Integer>flist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i =0;i<n;i++){
            TreeNode node = queue.poll();
            if(node.left!= null){
                queue.add(node.left);
            }
            if(node.right!= null){
                queue.add(node.right);
            }
            if(i == n-1){
                flist.add(node.val);
            }
        }}
        return flist;
    }
}