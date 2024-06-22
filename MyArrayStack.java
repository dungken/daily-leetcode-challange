public class MyArrayStack implements IStackQueue {
    private int[] arrayStack;
    private int SIZE;
    private int topIndex;

    public MyArrayStack(int size) {
        arrayStack = new int[size];
        SIZE = size;
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            arrayStack[++topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            return arrayStack[topIndex--];
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public void show() {
        if (!isEmpty()) {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(arrayStack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty!");
        }
    }
}
