public class Test {

    public static void main(String[] args) {
        MyBST myBST = new MyBST();

        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 5);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 1);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 6);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 0);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 3);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 7);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 2);

        myBST.mRoot = myBST.deleteNode(myBST.mRoot, 1);

        System.out.println("DONE!");
    }
}
