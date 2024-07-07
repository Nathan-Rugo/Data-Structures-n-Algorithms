package CATII.Queue;

import java.util.Arrays;

// Problem a: Modified Queue.java class and a test class with a main method per Part 1

public class Queue {
    public int maxSize;
    public long[] queArray; // reference to an array of ‘longs.’
    public int front, rear, nItems;

    public Queue(int s) { // constructor
        maxSize = s; // size and structure of queue determined here. User does not
        queArray = new long[maxSize]; // Constructor is passed desired queue size from client.
        front = 0; // instance and local variables initialized
        rear = -1; // front and rear
        nItems = 0; // and number of Items setup and initialized.
    } // end Constructor

    public void insert(long j) { // put item at rear of queue
        if (isFull()) { // check if queue is full
            System.out.println("Queue is full, cannot insert " + j);
            return;
        }
        if (rear == maxSize - 1) // deals with wraparound
            rear = -1; // if rear is at maxSize-1, then we need to wrap to 0.
        queArray[++rear] = j; // increment rear and insert
        System.out.println("Element " + j + " at position " + rear);
        nItems++; // one more item
    } // end insert()

    public long remove() { // take item from front of queue
        if (isEmpty()) { // check if queue is empty
            System.out.println("Queue is empty, cannot remove element");
            return -1;
        }
        long temp = queArray[front++]; // get value and increment front
        if (front == maxSize) // deal with wraparound
            front = 0; // it then checks to see if the new value causes wrap.
        nItems--; // one less item
        return temp; // return removed item
    } // end remove()

    public long peekFront() { // peek at front of queue
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            return -1;
        }
        return queArray[front];
    } // end peek()

    public boolean isEmpty() { // true if queue is empty
        return (nItems == 0);
    } // end isEmpty()

    public boolean isFull() {
        return (nItems == maxSize); // true if queue is full
    } // end isFull()

    public int size() { // number of items in queue
        return nItems;
    } // end size()
    public static void main(String[] args) {
        Labs.Queue.Queue queue = new Labs.Queue.Queue(10);
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
        queueDetails(queue, "Enque 2 elements");

        for (int i = 0; i < 2; i++) {
            queue.remove();
        }
        queueDetails(queue, "Deque 2 elements");

        for (int i = 12; i < 18; i++) {
            queue.insert(i);
        }
        queueDetails(queue, "Enque 5 elements");

        for (int i = 0; i < 11; i++) {
            queue.remove();
        }
        queueDetails(queue, "Deque 11 elements");
    }

    public static void queueDetails(Labs.Queue.Queue queue, String description) {
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
} // end class Queue
