/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if( p == root || q == root){
            return root;
        }

        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();

        findpath(root,p,arr1);
        findpath(root,q,arr2);

        return findlca(arr1,arr2);
     
    }

    public void findpath(TreeNode node,TreeNode a,ArrayList<TreeNode>list){
        if(node.val == a.val){
            list.add(a);
            return;
        }

        if(node.val > a.val){
            list.add(node);
            findpath(node.left,a,list);
        }
        if(node.val < a.val){
            list.add(node);
            findpath(node.right,a,list);
        }


    }

    public TreeNode findlca(ArrayList<TreeNode> list1,ArrayList<TreeNode> list2){
        TreeNode tn = null;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<Math.min(list1.size(),list2.size());i++){
            if(list1.get(i) == list2.get(i) && list1.get(i).val<min){ 
                tn = list1.get(i);
            }
        }
        return tn;
    }
}