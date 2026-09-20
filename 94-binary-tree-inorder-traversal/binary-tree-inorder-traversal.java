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
    public List<Integer> inorderTraversal(TreeNode root) {
        
       List<Integer> res = new ArrayList<>();
       Traverse(root,res);
       return res;
    }
    public void Traverse(TreeNode root,List<Integer> res){
        if(root == null) return ;
        Traverse(root.left,res);
        res.add(root.val);
        Traverse(root.right,res);
    }
}