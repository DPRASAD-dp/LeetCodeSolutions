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
        List<Integer> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            Integer rightside = null;
        for(int i = 0;i<n;i++){     
            TreeNode node = queue.poll();
            rightside = node.val;

            if(node.left!= null) queue.offer(node.left);
            if(node.right!= null) queue.offer(node.right);

        }

            arr.add(rightside);


        }
        return arr;
        
        
    }
}