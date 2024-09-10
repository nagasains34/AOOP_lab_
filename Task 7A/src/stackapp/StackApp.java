package stackapp;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        Stack<String> arrayStack = new ArrayStack<>();
        
        // Testing LinkedListStack with Integers
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack - Top element: " + linkedListStack.peek());
        System.out.println("LinkedListStack - Popped element: " + linkedListStack.pop());
        System.out.println("LinkedListStack - Is empty: " + linkedListStack.isEmpty());

        // Testing ArrayStack with Strings
        arrayStack.push("Hello");
        arrayStack.push("World");
        arrayStack.push("Java");
        System.out.println("ArrayStack - Top element: " + arrayStack.peek());
        System.out.println("ArrayStack - Popped element: " + arrayStack.pop());
        System.out.println("ArrayStack - Is empty: " + arrayStack.isEmpty());
    }
}
