public class NodeQueue {
    public static void main(String[] args) {
        // FIFO, LILO
        Queue myQueue = new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        System.out.println(myQueue); // [40,30,20,10]
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue); // [40,30]
    }
}

class Queue {
    void enqueue(int number){}
    void dequeue(){}
}