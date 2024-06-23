public class _112_Path_Sum_2 {
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


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traversal(root, 0, targetSum);
    }

    private boolean traversal(TreeNode currNode, int currSum, int targetSum) {
        // B1: Cong thuc co so | Dieu kien dung
        if(currNode == null) return false;

        currSum += currNode.val;
        if(isLeaf(currNode)) return currSum == targetSum;

        // B2: Cong thuc truy hoi | Cong thuc de quy
        boolean leftNodeResult = traversal(currNode.left, currSum, targetSum);
        boolean rightNodeResult = traversal(currNode.right, currSum, targetSum);
        return leftNodeResult || rightNodeResult;
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static void main(String[] args) {

    }
}
