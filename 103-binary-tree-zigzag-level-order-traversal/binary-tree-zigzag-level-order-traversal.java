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
        boolean isrev = false;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> arr = new ArrayList<>();
        
        if(root == null){
            return arr;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int size = queue.size();
            if(isrev){
            for(int i =0;i<size;i++){ 
                TreeNode node = queue.poll();
                int arrval = node.val;
                res.add(arrval);
                if(node.right!= null){queue.offer(node.right);}
                if(node.left!= null){queue.offer(node.left);}
   
            }
                        }
            else{
                for(int i =0;i<size;i++){ 
                TreeNode node = queue.poll();
                int arrval = node.val;
                res.add(arrval);
                if(node.right!= null){queue.offer(node.right);}
                if(node.left!= null){queue.offer(node.left);}
                
   
            }
            Collections.reverse(res);
            }
            arr.add(res);
            isrev = !isrev;
            }

            return arr;
        }

        
    }
