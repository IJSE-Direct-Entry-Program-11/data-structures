import java.util.Deque;
import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        Deque<Integer> myStack = new LinkedList<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println(myStack.peek()); // 40
        myStack.pop();
        myStack.pop();
        System.out.println(myStack); // [10, 20]
        System.out.println(myStack.peek()); // 20
    }
}
