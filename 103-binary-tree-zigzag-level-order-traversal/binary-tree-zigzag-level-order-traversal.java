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
            return new ArrayList<>();
        }
        boolean a = true;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();

            List<Integer>arr = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode temp = queue.poll();
                arr.add(temp.val);
                if(temp.right != null){
                    queue.add(temp.right);
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                
            }
            if(a){
                Collections.reverse(arr);
                
            }
            a = !a;
            ans.add(arr);
        }

        return ans;


    }
}