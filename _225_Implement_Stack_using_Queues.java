import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    static class MyStack {
        Queue<Integer> mainQueue = new LinkedList<>();
        Queue<Integer> secondQueue = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            mainQueue.add(x);
        }

        public int pop() {
            int value = -1;
            // Chuyen data tu main queue -> second queue
            while(!mainQueue.isEmpty()) {
                if(mainQueue.size() == 1) {
                    value = mainQueue.remove();
                } else {
                    secondQueue.add(mainQueue.remove());
                }
            }
            // Doi cho main queue & second queue
            Queue<Integer> temp = mainQueue;
            mainQueue = secondQueue;
            secondQueue = temp;

            return value;
        }

        public int top() {
            int value = -1;
            // Chuyen data tu main queue -> second queue
            while(!mainQueue.isEmpty()) {
                if(mainQueue.size() == 1) {
                    value = mainQueue.peek();
                    secondQueue.add(mainQueue.remove());
                } else {
                    secondQueue.add(mainQueue.remove());
                }
            }
            // Doi cho main queue & second queue
            Queue<Integer> temp = mainQueue;
            mainQueue = secondQueue;
            secondQueue = temp;

            return value;
        }

        public boolean empty() {
            return mainQueue.isEmpty();
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println();
    }
}
