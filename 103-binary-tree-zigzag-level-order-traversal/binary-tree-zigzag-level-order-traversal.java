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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return  new ArrayList<>();
        }
        List<List<Integer>> flist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean a = true;
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0;i<n;i++){
            TreeNode node = queue.poll();
            if(node.left!= null){
                queue.add(node.left);
            }
            if(node.right!= null){
                queue.add(node.right);
            }
            list.add(node.val);}
            if(a){
                flist.add(list);
            }
            else{
                Collections.reverse(list);
                flist.add(list);
            }
            a = !a;
            
        }
        return flist;
    }
}