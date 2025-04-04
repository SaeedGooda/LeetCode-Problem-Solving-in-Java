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
    private TreeNode lca;
    private int max = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) return root;
        dfs(root, 0);
        return lca;
    }
    
    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            max = Math.max(max, depth);
            return depth;
        }
        
        int leftDepth = dfs(node.left, depth + 1);
        int rightDepth = dfs(node.right, depth + 1);
        
        if (leftDepth == max && rightDepth == max) {
            lca = node;
        }
        return Math.max(leftDepth, rightDepth);
    }
}