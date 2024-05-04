package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToHead(4);
        linkedList.addToHead(1);
        linkedList.addToTail(5);
        linkedList.insert(2,2);
        linkedList.insert(3,3);
        linkedList.delete(5);
        linkedList.printList();
        linkedList.deleteMiddle();
        linkedList.printList();
    }
}
