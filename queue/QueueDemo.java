import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedBlockingQueue<>();
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        Integer removedItem = myQueue.poll();
        System.out.println("Removed Item: " + removedItem);
        System.out.println(myQueue); // head -> tail 

        // Bounded Queue
        Queue<String> myQueue2 = new ArrayBlockingQueue<>(5);
        myQueue2.offer("First");
        myQueue2.offer("Second");
        myQueue2.offer("Third");
        myQueue2.offer("Fourth");
        myQueue2.offer("Fifth");
        System.out.println(myQueue2.peek());
        myQueue2.poll();
        myQueue2.offer("Sixth");
        System.out.println(myQueue2.size());
        System.out.println(myQueue2);
    }
}
