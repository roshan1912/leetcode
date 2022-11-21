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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null) return 0;
        
        if(root.left!=null && root.left.left==null && root.left.right==null){
            return sum + root.left.val+sumOfLeftLeaves(root.right);
        } 
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}