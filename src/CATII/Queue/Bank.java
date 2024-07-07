package CATII.Queue;

import java.util.Scanner;

// Problem b: Modified Queue.java class and a test class with a main method per Part 2
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
    public static void main(String[] args) {
        Labs.Queue.Bank queue = new Labs.Queue.Bank(10);
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;

        while (running) {
            System.out.println("Choose role:");
            System.out.println("1. Security Guard");
            System.out.println("2. Bank Teller");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    securityGuardActions(queue, scanner);
                    break;
                case "2":
                    bankTellerActions(queue, scanner);
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void securityGuardActions(Labs.Queue.Bank queue, Scanner scanner) {
        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();
        queue.insert(name);
    }

    public static void bankTellerActions(Labs.Queue.Bank queue, Scanner scanner) {
        System.out.println("1. Dequeue customer");
        System.out.println("2. Peek front customer");
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                String served = queue.remove();
                if (served != null) {
                    System.out.println("Served customer: " + served);
                }
                break;
            case "2":
                String front = queue.peekFront();
                if (front != null) {
                    System.out.println("Customer at front: " + front);
                }
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
