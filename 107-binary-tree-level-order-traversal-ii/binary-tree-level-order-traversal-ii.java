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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        if(root  == null){
            return new ArrayList<>();
        }


        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> arr = new ArrayList<>();
            for(int i= 0;i<n;i++){
            TreeNode temp = queue.poll();
            arr.add(temp.val);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }}
            ans.add(arr);

        }

    return ans.reversed();

        
    }
}