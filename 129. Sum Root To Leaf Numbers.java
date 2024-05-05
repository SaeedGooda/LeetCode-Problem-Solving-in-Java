class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    private int sumNumbers(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        int newSum = sum * 10 + node.val;
        if(node.left == null && node.right == null){
            return newSum;
        }
        return sumNumbers(node.left, newSum) + sumNumbers(node.right, newSum);
    }
}