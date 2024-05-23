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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    public boolean isValid(TreeNode node, Integer lower, Integer upper){
        if(node == null){
            return true;
        }
        int val = node.val;
        if(lower != null && val <= lower){
            return false;
        }
        if(upper != null && val >= upper){
            return false;
        }
        return (isValid(node.left, lower, val) && isValid(node.right, val, upper));
    }
}