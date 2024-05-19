class Solution {
    private int sum = 0;
    public int findTilt(TreeNode root) {
        getSum(root);
        return sum;
    }
    private int getSum(TreeNode node){
        if(node == null) return 0;
        int left = getSum(node.left);
        int right = getSum(node.right);
        sum += Math.abs(left - right);
        return left + right + node.val;
    }
}