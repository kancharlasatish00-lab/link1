package Demo;

public class LinkedListExample { 
static class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
Node head;
void insertAtEnd(int data) {
	Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	Node current = head;
	while (current.next != null) {
		current = current.next;
	}
	current.next = newNode;
}
void display() {
	Node current = head;
	while (current != null) {
		System.out.println(current.data + " -> ");
		current = current.next;
	}
	System.out.println("null");
}
public static void main(String[] args) {
	LinkedListExample list = new LinkedListExample();
	list.insertAtEnd(10);
	list.insertAtEnd(20);
	list.insertAtEnd(30);
	list.insertAtEnd(40);
	list.display();
}
}
