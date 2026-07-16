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
    public int level(TreeNode root){
        if(root==null) return 0;
        int leftLevel=level(root.left);
        int rightLevel=level(root.right);
        if(leftLevel==-1 || rightLevel==-1) return -1;
        int diff=Math.abs(leftLevel-rightLevel);
        if(diff>1) return -1;
        return 1+Math.max(leftLevel,rightLevel);
    }
    public boolean isBalanced(TreeNode root) {
        if(level(root)==-1) return false;
        return true;
    }
}
