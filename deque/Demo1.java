import java.util.ArrayDeque;
import java.util.Deque;

public class Demo1 {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.push(10);       // = offerFirst
        myDeque.offer(20);      // = offerLast
        myDeque.offer(30);
        myDeque.push(40);
        myDeque.offerFirst(50);
        myDeque.offerLast(60);
        // [60, 30, 20, 10, 40, 50]
        // [50, 40, 10, 20, 30, 60]
        System.out.println(myDeque);
        myDeque.pop();              // = pollFirst
        myDeque.poll();             // = pollFirst
        // [60, 30, 20, 10, 40, 50] -> [60, 30, 20, 10]
        // [10, 20, 30, 60]
        System.out.println(myDeque);
    }
}
