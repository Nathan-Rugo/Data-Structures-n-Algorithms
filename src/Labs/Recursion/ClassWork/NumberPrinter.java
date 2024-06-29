package Labs.Recursion.Classwork;

// Problem 2: Print Numbers in a Range
import java.util.Scanner;

public class NumberPrinter {
    // Recursive method to print numbers in a range from start to end
    public static void printRange(int start, int end) {
        if (start > end) {
            return;
        } else {
            System.out.println(start);
            printRange(start + 1, end);
        }
    }

    // Main method to get user input for start and end, then print the range
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        printRange(start, end);
        scanner.close();
    }
}

