import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Is myStack empty? " + myStack.empty());

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println("Is 50 in? " + myStack.contains(50));
        System.out.println("Is 20 in? " + myStack.contains(20));
        System.out.println("Is myStack empty? " + myStack.empty());
        System.out.println("Peek: " + myStack.peek());
        System.out.println(myStack);
        int removedItem = myStack.pop();
        System.out.println("Removed Item: " + removedItem);
        removedItem = myStack.pop();
        System.out.println("Removed Item: " + removedItem);
        System.out.println(myStack);
        System.out.println("Peek: " + myStack.peek());
    }
}