package CATII.LinkedList;


// Problem a:  Corrected LinkedList2 java class

public class LinkedList2 {

    // reference to the head node.
    private Node head;

    private int listCount;

    public LinkedList2() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        //head = new Node(null);
        head = null;
        listCount = 0;
    }

    public void addToHead(Object data) // Add data to the head of a linked list
    {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        listCount++;
    }

    public void add(Object data) // appends the specified element to the end of this list.
    {
        Node temp = new Node(data);
        Node current = head;

        if (current == null) {
            head = temp;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }

        listCount++;// increment the number of elements variable
    }

    public void addSpecific(Object data, int index) // inserts the specified element at the specified position in this list
    {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node temp = new Node(data);
        Node current = head;

        if (index == 0) {
            addToHead(data);
        } else {
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            temp.setNext(current.getNext());
            current.setNext(temp);
            listCount++;
        }
    }

    public Object get(int index) // returns the element at the specified position in this list.
    {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index) // removes the element at the specified position in this list
    {
        if (index < 0 || index >= size()) {
            return false;
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }

        listCount--; // decrement the number of elements variable
        return true;
    }

    public int size() // returns the number of elements in this list
    {
        return listCount;
    }

    public void traverse() {
        Node current = head;
        int i = 0;
        while (current != null) {
            System.out.println("For the node at index " + i + " the data is " + current.getData());
            current = current.getNext();
            i++;
        }
    }
    private class Node {

        Node next;// reference to the next node in the chain, or null if there isn't one.

        Object data; // data carried by this node could be of any type you need.

        public Node(Object dataValue) // Node constructor
        {
            next = null;
            data = dataValue;
        }

        public Node(Object dataValue, Node nextValue) // another Node constructor if we want to specify the node to point to.
        {
            next = nextValue;
            data = dataValue;
        }

        public Object getData() // these methods should be self-explanatory
        {
            return data;
        }

        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() // returns reference to next node
        {
            return next;

        }

        public void setNext(Node nextValue) // set node's next reference
        {
            next = nextValue;
        }
    }
    public static void main(String[] args) {
        LinkedList2 myList = new LinkedList2();

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
