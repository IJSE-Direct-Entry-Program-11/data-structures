import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo2 {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new LinkedBlockingDeque<>();
        myDeque.offerLast(10);
        myDeque.offerLast(20);
        myDeque.offerLast(30);
        myDeque.offerLast(40);
        myDeque.offerLast(50);
        System.out.println(myDeque.peek()); // = peekFirst()
        System.out.println(myDeque.peekLast()); // = peekFirst()
    }
}
