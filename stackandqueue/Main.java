package stackandqueue;

public class Main {
    public static void main(String[] args) {
        MyLinkedListStack stack = new MyLinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
    }
}
