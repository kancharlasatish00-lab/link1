package Demo;

import Demo.LinkedListExample.Node;

public class InsertAtBeginning {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
	void InsertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
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
		InsertAtBeginning list = new InsertAtBeginning();
		list.InsertAtBeginning(30);
		list.InsertAtBeginning(20);
		list.InsertAtBeginning(10);
		list.InsertAtBeginning(5);
		list.display();

	}
}
