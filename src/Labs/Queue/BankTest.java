package Labs.Queue;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank queue = new Bank(10);
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

    public static void securityGuardActions(Bank queue, Scanner scanner) {
        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();
        queue.insert(name);
    }

    public static void bankTellerActions(Bank queue, Scanner scanner) {
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
