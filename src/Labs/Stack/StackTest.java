package Labs.Stack;

public class StackTest {
    public static void main(String[] args) {
        StackX stack = new StackX(10);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.printStack();
        long topElement = stack.peek();
        System.out.println("The top element is: "+ topElement);
        stack.push(10);
        for(int i = 0; i < 5;i++){
            long newtopElement = stack.pop();
            System.out.println("The new top element is: "+ newtopElement);
        }
        stack.printStack();
        long topElement1 = stack.peek();
        System.out.println("The top element is: "+ topElement1);
        for(int i = 0; i < 6;i++){
            long newtopElement = stack.pop();
            if (newtopElement != stack.gettop()){
            System.out.println("The new top element is: "+ newtopElement);
            }
            else{
                break;
            }
        }
        stack.push(0);
        stack.printStack();
    }
}