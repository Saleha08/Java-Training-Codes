// Implementation of a Singly Linked List with insertion, deletion, and display operations.

public class SinglyLL {

    // Node class representing a node in the singly linked list
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;

    // Constructor to initialize an empty linked list
    SinglyLL() {
        this.head = null;
    }

    // Inserts a node with given value at the end of the list
    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Deletes the first occurrence of a node with given value
    void deleteByValue(int val) {
        if (head == null) {
            System.out.println("LinkedList is empty.");
            return;
        }
        if (head.data == val) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Value is not in the list.");
    }

    // Inserts a node at the beginning of the list
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Inserts a node at the end of the list
    void insertAtEnd(int val) {
        insert(val); // Reusing the insert method
    }

    // Inserts a node at a specific position (1-based index)
    void insertAtPosition(int val, int pos) {
        if (pos == 1) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        int i = 1;
        while (i != pos - 1 && curr != null) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Displays the contents of the list
    void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // Main method to test the singly linked list implementation
    public static void main(String[] args) {
        SinglyLL m = new SinglyLL();

        // Insert initial nodes
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.display(); // Output: 1 2 3 4
        System.out.println();

        // Delete nodes by value
        m.deleteByValue(2);
        m.deleteByValue(4);
        m.display(); // Output: 1 3
        System.out.println();

        // Insert at beginning, end, and specific position
        m.insertAtBeginning(10);   // List: 10 1 3
        m.insertAtEnd(20);         // List: 10 1 3 20
        m.insertAtPosition(30, 3); // List: 10 1 30 3 20
        m.display();               // Output: 10 1 30 3 20
    }
}
