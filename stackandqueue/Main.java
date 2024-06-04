package stackandqueue;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));

        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
    }
}
