import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue.peek()); // 20
    }
}
