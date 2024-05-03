class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, 0, targetSum);
    }
    public boolean hasPathSum(TreeNode node, int sum, int target){
        if(node == null){
            return false;
        }
        sum += node.val;
        if(node.left == null && node.right == null){
            return sum == target;
        }
        return (hasPathSum(node.left, sum, target) || hasPathSum(node.right, sum, target));
    }
}