package recursion.com.assignment;

// Problem 3: Sum of Numbers using Recursion
import java.util.Scanner;

public class SumCalculator {
    // Recursive method to calculate the sum of numbers from 1 to n
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    // Main method to get user input for n and print the sum
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum from 1 to n: ");
        int n = scanner.nextInt();
        int sum = calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}

