import java.util.Stack;

public class _155_Min_Stack {
    public static class MinStack {
        class Node {
            int value;
            int MIN;

            Node(int value) {
                this.value = value;
            }
        }

        Stack<Node> stack = new Stack<>();

        public MinStack() {

        }

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.MIN = stack.isEmpty() ? val : Math.min(val, stack.peek().MIN);
            stack.add(newNode);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().value;
        }

        public int getMin() {
            return stack.peek().MIN;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        minStack.push(-1);
        minStack.push(-2);
        minStack.push(-3);
    }
}
