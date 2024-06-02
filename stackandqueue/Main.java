package stackandqueue;

public class Main {
    public static void main(String[] args) {
        MyArrayStack myArrayStack = new MyArrayStack(4);

        System.out.println(myArrayStack.push(10));
        System.out.println(myArrayStack.push(20));
        System.out.println(myArrayStack.push(30));
        System.out.println(myArrayStack.push(40));
        System.out.println(myArrayStack.push(50));


        myArrayStack.show();
        System.out.println(myArrayStack.pop());
        myArrayStack.show();
        System.out.println(myArrayStack.pop());
        myArrayStack.show();
        System.out.println(myArrayStack.pop());
        myArrayStack.show();
        System.out.println(myArrayStack.pop());
        myArrayStack.show();
        System.out.println(myArrayStack.pop());
    }
}
