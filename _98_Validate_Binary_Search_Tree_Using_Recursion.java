public class _98_Validate_Binary_Search_Tree_Using_Recursion {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return checkNode(root, null, null);
    }

    private boolean checkNode(TreeNode currNode, TreeNode minNode, TreeNode maxNode) {
        if(currNode == null)
            return true;
        if(minNode != null && currNode.val <= minNode.val)
            return false;
        if(maxNode != null && currNode.val >= maxNode.val)
            return false;

        boolean isLeftTreeOk = checkNode(currNode.left, minNode, currNode);
        boolean isRightTreeOk = checkNode(currNode.right, currNode, maxNode);
        return isLeftTreeOk && isRightTreeOk;
    }

    public static void main(String[] args) {

    }
}
