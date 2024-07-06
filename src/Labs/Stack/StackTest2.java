package Labs.Stack;

import java.util.Scanner;

public class StackTest2 {
    public static void main(String[] args) throws InterruptedException {
        StackX2 stack = new StackX2();
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        stack.isPalindrome(word);
    }
}
