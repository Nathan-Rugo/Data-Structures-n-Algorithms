package Labs.Recursion.Classwork;

// Problem 5: GCD of Two Numbers using Labs.Labs.Recursion
import java.util.Scanner;

public class GCDCalculator {
    // Recursive method to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Main method to get user input for two numbers and print their GCD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}

