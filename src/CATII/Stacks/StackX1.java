// stack.java
// demonstrates stacks
////////////////////////////////////////////////////////////////
package CATII.Stacks;

// Problem a: Modified StackX class as per Step 1 to 16 of the Stacks Lab
public class StackX1
{
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack
    //--------------------------------------------------------------
    public StackX1(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }
    //--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        if(isFull()){
            System.out.println("The Stack is full. You can not add a new element to the stack!!");
        }
        else{
            stackArray[++top] = j; // increment top, insert item
        }
    }
    //--------------------------------------------------------------
    public long pop() throws ArrayIndexOutOfBoundsException // take item from top of stack
    {   if (isEmpty()){
            System.out.println("You cannot pop an element! The stack is empty!!");
            //throw new ArrayIndexOutOfBoundsException("Empty stack");
        }
        try{
            return stackArray[top--]; // access item, decrement top
        }catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Array index out of bounds");
            return top;
        }
    }
    //--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize-1);
    }
    public void printStack(){
        if (isEmpty()){
            System.out.println("Empty Stack\n");
        }
        else{
            int currentPointer = 0;
            System.out.println("The contents of the stack are: ");
            while(currentPointer != top+1){
                System.out.println(stackArray[currentPointer]);
                currentPointer+=1;
            }
        }
    }
    public int gettop(){
        return top;
    }
    public static void main(String[] args) {
        // Creating an instance of a stack with a length of 10 elements
        Labs.Stack.StackX1 stack = new Labs.Stack.StackX1(10);
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
//--------------------------------------------------------------
} // end class StackX
