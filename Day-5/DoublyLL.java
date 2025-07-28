// Implementation of a Doubly Linked List with insertion, deletion, palindrome check, reverse, and rotation operations.

public class DoublyLL {

    Node head;
    Node tail;

    // Node class representing each element in the doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    // Constructor initializes empty list
    DoublyLL() {
        this.head = null;
        this.tail = null;
    }

    // Inserts a new node at the end of the list
    void insert(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Displays the elements of the list
    void display() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    // Deletes a node by value
    void delete(int ele) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.data == ele && head.next == null) {
            head = null;
            tail = null;
        } else if (head.data == ele) {
            head = head.next;
            head.prev = null;
        } else if (tail.data == ele) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node curr = head;
            while (curr.next != null && curr.next.data != ele) {
                curr = curr.next;
            }
            if (curr.next != null) {
                curr.next = curr.next.next;
                if (curr.next != null) {
                    curr.next.prev = curr;
                }
            }
        }
    }

    // Inserts a node after a given value (add in middle or end)
    void addMiddle(int val, int data) {
        Node newNode = new Node(data);
        if (head == null) return;

        if (head.data == val) {
            newNode.next = head.next;
            if (head.next != null) head.next.prev = newNode;
            head.next = newNode;
            newNode.prev = head;
            if (newNode.next == null) tail = newNode;
        } else if (tail.data == val) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node curr = head;
            while (curr != null && curr.data != val) {
                curr = curr.next;
            }
            if (curr != null && curr.next != null) {
                newNode.next = curr.next;
                curr.next.prev = newNode;
                curr.next = newNode;
                newNode.prev = curr;
            }
        }
    }

    // Checks if the list is a palindrome
    boolean checkPalindrome() {
        Node f = head;
        Node l = tail;
        while (f != null && l != null && f != l && f.prev != l) {
            if (f.data != l.data) {
                return false;
            }
            f = f.next;
            l = l.prev;
        }
        return true;
    }

    // Reverses the doubly linked list
    void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Rotates the list to the left by 'n' positions
    void leftRotate(int n) {
        if (head == null || head.next == null || n <= 0) return;

        while (n > 0) {
            Node oldHead = head;
            head = head.next;
            head.prev = null;

            tail.next = oldHead;
            oldHead.prev = tail;
            oldHead.next = null;
            tail = oldHead;
            n--;
        }

        display();
    }

    // Rotates the list to the right by 'n' positions
    void rightRotate(int n) {
        if (head == null || head.next == null || n <= 0) return;

        while (n > 0) {
            Node oldTail = tail;
            tail = tail.prev;
            tail.next = null;

            head.prev = oldTail;
            oldTail.next = head;
            oldTail.prev = null;
            head = oldTail;
            n--;
        }

        display();
    }

    // Main method to test the Doubly Linked List
    public static void main(String[] args) {
        DoublyLL d = new DoublyLL();

        // Insert elements
        d.insert(10);
        d.insert(20);
        d.insert(30);
        d.insert(40);
        d.insert(50);
        d.display(); // Output: 10 20 30 40 50
        System.out.println();

        // Insert in the middle after 30
        d.addMiddle(30, 60);
        d.display(); // Output: 10 20 30 60 40 50

        // Uncomment to test other features:
        // boolean result = d.checkPalindrome();
        // System.out.println(result);

        // d.reverse();
        // d.display();

        // d.leftRotate(2);
        // System.out.println();

        // d.rightRotate(2);
    }
}
