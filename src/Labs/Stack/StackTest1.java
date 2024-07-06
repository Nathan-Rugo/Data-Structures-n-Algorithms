package Labs.Stack;

public class StackTest1 {
    public static void main(String[] args) {
        // Creating an instance of a stack with a length of 10 elements
        StackX1 stack = new StackX1(10);
        // Pushing 10 elements
        for(int i = 0; i <10; i++){
            stack.push(i);
        }
        // Printing the stack's content
        stack.printStack();
        //Printing the stack's top element using peek() method
        long topElement = stack.peek();
        System.out.println("The top element is: "+ topElement);

        // Pushing another element
        stack.push(10);

        // Popping 5 elements from the stack and printing the stack after popping
        for(int i = 0; i < 5;i++){
            long newtopElement = stack.pop();
            System.out.println("The new top element is: "+ newtopElement);
        }
        stack.printStack();

        // Printing the top element of the stack
        long topElement1 = stack.peek();
        System.out.println("The top element is: "+ topElement1);

        // Popping 6 elements from the stack and handling underflow error
        for(int i = 0; i < 6;i++){
            long newtopElement = stack.pop();
            if (newtopElement != stack.gettop()){
            System.out.println("The new top element is: "+ newtopElement);
            }
            else{
                break;
            }
        }
    }
}