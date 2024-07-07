package Labs.Queue;

public class Bank {
    private int maxSize;
    public String[] queArray; // reference to an array of Strings
    public int front, rear, nItems;
    private int codeCounter = 1; // Counter for assigning codes

    public Bank(int s) {
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String name) {
        if (isFull()) {
            System.out.println("Queue is full, cannot insert " + name);
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        String code = "C" + codeCounter++;
        queArray[++rear] = code + " - " + name;
        System.out.println("Element " + name + " with code " + code + " at position " + rear);
        nItems++;
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot remove element");
            return null;
        }
        String temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public String peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            return null;
        }
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}
