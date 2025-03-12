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
    public int kthSmallest(TreeNode root, int k) {
       
        List<Integer>list = new ArrayList<>();
        helper(root,list);
        
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        return list.get(k-1);

        }

    void helper(TreeNode root,List<Integer>list){
        if(root == null){
            return;
        }

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);

    }
}