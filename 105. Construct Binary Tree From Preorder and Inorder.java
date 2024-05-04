class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inoderMap = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            inoderMap.put(inorder[i], i);
        }
        return buildTree(inoderMap, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode buildTree(Map<Integer, Integer> inorderMap, int [] preorder, int preStart, int preEnd, int [] inorder, int inStart, int inEnd){
        if (preStart > preEnd) {
            return null;
        }
        int value = preorder[preStart];
        TreeNode root = new TreeNode(value);
        int mid = inorderMap.get(value);
        int leftTreeSize = mid - inStart;
        root.left = buildTree(inorderMap, preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, mid - 1);
        root.right = buildTree(inorderMap, preorder, preStart + leftTreeSize + 1, preEnd, inorder, mid + 1, inEnd);
        return root;
    }
}