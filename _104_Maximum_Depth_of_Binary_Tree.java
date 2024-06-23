public class _104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int heightLeftTree = maxDepth(root.left);
        int heightRightTree = maxDepth(root.right);

        int result = Math.max(heightLeftTree, heightRightTree) + 1;
        return result;
    }
}
