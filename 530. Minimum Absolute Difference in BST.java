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
    private int min = Integer.MAX_VALUE; 
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
        
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        if(prev != null){
            min = Math.min(min, node.val - prev.val);
        }
        prev = node;
        dfs(node.right);
    }
}