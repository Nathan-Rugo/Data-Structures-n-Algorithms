package Labs.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList1 myList = new LinkedList1();

        // Adding 5 items to the linked list
        for (int i = 0; i < 5; i++) {
            myList.add(i); // Adding numbers
        }

        // Adding a head node
        myList.addToHead("Head Node");

        // Adding five more nodes
        for (int i = 5; i < 10; i++) {
            myList.add(i); // Adding numbers
        }

        // Printing out the contents of the linked list
        System.out.println("Contents of the linked list:");
        myList.traverse();

        // Deleting the first and second item
        myList.remove(0);
        myList.remove(0);

        // Adding an item to index 5 of the linked list
        myList.addSpecific("New Node", 5);

        // Printing out the contents of the linked list after modifications
        System.out.println("\nContents of the linked list after modifications:");
        myList.traverse();

    }
}
