public class _112_Path_Sum {
    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public boolean traversal(TreeNode currNode, int currSum, int target) {
        // Dieu kien co so
        if(currNode == null)
            return false;

        currSum += currNode.value;
        if(isLeaf(currNode))
            return currSum == target;

        boolean resultLeftTraversal = traversal(currNode.left, currSum, target);
        boolean resultRightTraversal = traversal(currNode.right, currSum, target);
        return resultLeftTraversal || resultRightTraversal;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traversal(root, 0, targetSum);
    }
}
