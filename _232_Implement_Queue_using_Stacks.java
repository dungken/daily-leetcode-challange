import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    class MyQueue {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> reverseStack = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            mainStack.push(x);
        }

        public int pop() {
            if(reverseStack.isEmpty()) {
                while(!mainStack.isEmpty()) {
                    reverseStack.push(mainStack.pop());
                }
            }
            return reverseStack.pop();
        }

        public int peek() {
            if(reverseStack.isEmpty()) {
                while(!mainStack.isEmpty()) {
                    reverseStack.push(mainStack.pop());
                }
            }
            return reverseStack.peek();
        }

        public boolean empty() {
            return mainStack.isEmpty() && reverseStack.isEmpty();
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    public static void main(String[] args) {

    }
}
