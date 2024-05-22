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
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return list.get(k-1);
    }
    private void dfs(TreeNode node, int k){
        if(node == null || list.size() == k){
            return;
        }
        dfs(node.left, k);
        list.add(node.val);
        dfs(node.right, k);
    }
}