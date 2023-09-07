import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("Hello");
        myStack.push("World!");
        myStack.push("We");
        myStack.push("are");
        myStack.push("born");
        myStack.push("to");
        myStack.push("code");
        myStack.push("!");

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
}
