package Labs.Recursion.Classwork;

// Problem 4: Print Array Elements using Labs.Labs.Recursion
public class ArrayPrinter {
    // Recursive method to print array elements
    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        } else {
            System.out.println(arr[index]);
            printArray(arr, index + 1);
        }
    }

    // Main method to create an array and print its elements
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        printArray(arr, 0);
    }
}

