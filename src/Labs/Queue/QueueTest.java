package Labs.Queue;

import java.util.Arrays;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        System.out.println("The front index is " + queue.front);
        System.out.println("The rear index is " + queue.rear);

        for (int i = 0; i < 10; i++) {
            queue.insert(i);
        }
        queueDetails(queue,"Inserting 10 elements");

        for (int i = 0; i < 3; i++) {
            queue.remove();
        }
        queueDetails(queue, "Deque 3 elements");

        for (int i = 10; i < 12; i++) {
            queue.insert(i);
        }
        queueDetails(queue, "Enqueue 2 elements");

        for (int i = 0; i < 2; i++) {
            queue.remove();
        }
        queueDetails(queue, "Deque 2 elements");

        for (int i = 12; i < 18; i++) {
            queue.insert(i);
        }
        queueDetails(queue, "Enqueue 5 elements");

        for (int i = 0; i < 11; i++) {
            queue.remove();
        }
        queueDetails(queue, "Deque 11 elements");
    }

    public static void queueDetails(Queue queue, String description) {
        int front = queue.front;
        int rear = queue.rear;
        long[] array = new long[queue.size()];
        for (int i = 0; i < queue.size(); i++) {
            array[i] = queue.queArray[(front + i) % queue.maxSize];
        }
        System.out.println("\nQueue details: "+description);
        System.out.println("The queue in original format is "+ Arrays.toString(queue.queArray));
        System.out.println("The front index is " + front);
        System.out.println("The rear index is " + rear);
        System.out.println("The queue from front to rear is " + Arrays.toString(array)+ "\n");
    }
}
