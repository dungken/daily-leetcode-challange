public class MyLinkedListQueue implements IStackQueue {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;

    MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull())
            return false;
        Node newNode = new Node(value);
        if (isEmpty())
            headNode = tailNode = newNode;
        else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        if(headNode == tailNode) {
            headNode = tailNode = null;
            return -1;
        }
        int value = headNode.value;
        headNode = headNode.next;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Queue is empty!");
        else {
            Node currNode = headNode;
            while (currNode != null) {
                System.out.print(currNode.value + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    }
}
