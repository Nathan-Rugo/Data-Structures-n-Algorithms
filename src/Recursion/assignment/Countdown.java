package Recursion.assignment;// Problem 1: Countdown
import java.util.Scanner;

public class Countdown {
    // Recursive method to count down from n to 0
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        } else if (n > 0) {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    // Main method to get user input and start countdown
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start countdown from: ");
        int start = scanner.nextInt();
        countdown(start);
        scanner.close();
    }
}
