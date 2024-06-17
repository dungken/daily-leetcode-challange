package tree;

import java.util.ArrayList;
import java.util.List;

public class MyBST {
    public TreeNode mRoot;

    public MyBST() {

    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        // TH: root == null
        if (root == null) {
            root = newNode;
        } else { // TH: root != null
            TreeNode temp = root;
            while (true) {
                if (temp.value > value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else { // temp.value < value
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }

        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int value) {
        // TH: root == null
        if (root == null) {
            return new TreeNode(value);
        }

        // TH: root != null
        if (value < root.value) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insertIntoBST(root.left, value);
            }
        } else { // value > root.value
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insertIntoBST(root.right, value);
            }
        }

        return root;
    }


    // Tim node ben trai cung cua cay
    public TreeNode findLeftMostTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null)
            leftMostNode = leftMostNode.left;
        return leftMostNode;
    }


    // Tim node key trong tree va xoa node key do
    // Return ve tree moi sau khi xoa node key
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        // B1: Tim node key
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else { // key == root.value
            // B2: Xoa node key
            // TH1: Key la node la
            if (root.left == null && root.right == null)
                return null;
            // TH2: Co 1 node con
            if (root.left != null && root.right == null) // Co 1 con ben trai
                return root.left;
            if (root.left == null && root.right != null)// Co 1 con ben phai
                return root.right;
            // TH3: Co 2 node con (Tim node ben trai cung cua cay con ben phai)
            TreeNode leftMostNode = findLeftMostTree(root.right);
            root.value = leftMostNode.value;
            root.right = deleteNode(root.right, leftMostNode.value);
        }

        return root;
    }

    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null)
            return null;

        if (key < root.value) {
            return searchBST(root.left, key);
        } else if (key > root.value) {
            return searchBST(root.right, key);
        } else {
            return root;
        }
    }
    List<Integer> preorderResult = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return preorderResult;
        }

        preorderResult.add(root.value);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return preorderResult;
    }
    List<Integer> inorderResult = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return inorderResult;
        }

        inorderTraversal(root.left);
        inorderResult.add(root.value);
        inorderTraversal(root.right);

        return inorderResult;
    }

    List<Integer> postorderResult = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return postorderResult;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorderResult.add(root.value);

        return postorderResult;
    }

}
