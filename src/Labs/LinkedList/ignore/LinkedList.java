package Labs.LinkedList.ignore;

public class LinkedList{
    Node head;
    public int Size(){
        int size = 0;
        Node current = head;
        while (current != null){
            size+=1;
            current = current.next;
        }
        return size;
    }
    public void addToHead(int key) {
        Node node = new Node(key);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    public void addToTail(int key){
        Node node = new Node(key);
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;

    }
    public void insert(int key, int position){
        Node node = new Node(key);
        Node current;
        int size = Size();
        current = head;
        Node previous = null;
        int start = 1;
        while(start < size){
            if(start == position){
                previous.next = node;
                node.next = current;
                break;
            }
            else{
                previous = current;
                current = current.next;
                start+=1;
            }
        }
    }
    public void delete(int key){
        Node previous = null;
        Node current = head;

        while(current != null){
            if(current.data == key){
                previous.next = current.next;
                break;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
    }
    public void deleteMiddle(){
        Node fast = head;
        Node slow = head;
        Node previous = null;
        while(fast != null){
            if (fast.next == null || fast.next.next == null){
                previous.next = slow.next;
                break;
            }
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }

    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
        }
    }