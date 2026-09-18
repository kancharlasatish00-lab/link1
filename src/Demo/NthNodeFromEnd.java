package Demo;

public class NthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert node at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Find Nth node from the end
    void nthNodeFromEnd(int n) {
        Node first = head;
        Node second = head;

        // Move first pointer n positions
        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("Invalid value of n");
                return;
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println(n + "th node from the end is: " + second.data);
    }

    public static void main(String[] args) {

        NthNodeFromEnd list = new NthNodeFromEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        int n = 2;

        list.nthNodeFromEnd(n);
    }
}