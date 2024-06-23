public class _104_Maximum_Depth_of_Binary_Tree_2 {
    public int maxDepth(TreeNode root) {
        // Dieu kien dung | Cong thuc co so
        if(root == null)
            return 0;

        // Cong thuc truy hoi | Cong thuc de quy
        int heightLeftTree = maxDepth(root.left);
        int heightRightTree = maxDepth(root.right);

        return Math.max(heightLeftTree, heightRightTree) + 1;
    }
    public static void main(String[] args) {

    }
}
