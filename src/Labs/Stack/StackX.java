// stack.java
// demonstrates stacks
////////////////////////////////////////////////////////////////
package Labs.Stack;
public class StackX
{
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack
    //--------------------------------------------------------------
    public StackX(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }
    //--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        if(isFull()){
            System.out.println("Labs.Labs.Stack is full. You can not add a new element to the stack!!");
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
            System.out.println("Array index out of bounds: " + e.getMessage());
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
            System.out.println("Empty Labs.Labs.Stack\n");
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
//--------------------------------------------------------------
} // end class StackX
