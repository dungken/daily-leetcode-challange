import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;

    public MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        // Them vao dau linked list
        if (!isFull()) {
            Node topNodeNew = new Node(value);
            topNodeNew.next = topNode;
            topNode = topNodeNew;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // Xoa dau linked list
        int value = -1;
        if (!isEmpty()) {
            value = topNode.value;
            topNode = topNode.next;
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            ArrayList<Integer> tempArray = new ArrayList<>();
            Node top = topNode;
            while (top != null) {
                tempArray.add(top.value);
                top = top.next;
            }
            for (int i = tempArray.size() - 1; i >= 0; i--) {
                System.out.print(tempArray.get(i) + " ");
            }
            System.out.println();
        }
    }
}
