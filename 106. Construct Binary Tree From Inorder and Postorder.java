class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inoderMap = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            inoderMap.put(inorder[i], i);
        }
        return buildTree(inoderMap, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);   
    }
    private TreeNode buildTree(Map<Integer, Integer> inorderMap, int [] inorder, int inStart, int inEnd, int [] postorder, int postStart, int postEnd){
        if(inStart > inEnd){
            return null;
        }
        int value = postorder[postEnd];
        TreeNode root = new TreeNode(value);
        int mid = inorderMap.get(value);
        int leftTreeSize = mid - inStart;
        root.left = buildTree(inorderMap, inorder, inStart, mid - 1 , postorder, postStart, postStart + leftTreeSize - 1);
        root.right = buildTree(inorderMap, inorder, mid + 1, inEnd, postorder, postStart + leftTreeSize, postEnd - 1);
        return root;
    }
}