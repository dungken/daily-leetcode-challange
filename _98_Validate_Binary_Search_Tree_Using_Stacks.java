import java.util.Stack;

public class _98_Validate_Binary_Search_Tree_Using_Stacks {
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


    Stack<TreeNode> currStack = new Stack<>();
    Stack<TreeNode> minStack = new Stack<>();
    Stack<TreeNode> maxStack = new Stack<>();


    public boolean isValidBST(TreeNode root) {
        currStack.push(root);
        minStack.push(null);
        maxStack.push(null);

        while (!currStack.empty()) {
            TreeNode currNode = currStack.pop();
            TreeNode minNode = minStack.pop();
            TreeNode maxNode = maxStack.pop();

            if (currNode == null)
                continue;
            if (checkValid(currNode, minNode, maxNode)) {
                addStacks(currNode.right, currNode, maxNode); // add element right
                addStacks(currNode.left, minNode, currNode); // add element left
            } else {
                return false;
            }
        }
        return true;
    }

    private void addStacks(TreeNode currNode, TreeNode minNode, TreeNode maxNode) {
        currStack.add(currNode);
        minStack.add(minNode);
        maxStack.add(maxNode);
    }

    private boolean checkValid(TreeNode currNode, TreeNode minNode, TreeNode maxNode) {
        if (currNode == null)
            return true;
        if (minNode != null && minNode.val >= currNode.val)
            return false;
        if (maxNode != null && maxNode.val <= currNode.val)
            return false;
        return true;
    }


    public static void main(String[] args) {

    }
}
 