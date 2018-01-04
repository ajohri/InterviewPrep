package LinkedList;

public class LinkedList {
	Node head;

	public LinkedList(int value) {
		head = new Node(value);
	}

	// This is assuming we have no tail pointer
	public void addNode(Node newNode) {
		Node temp = head;

		// This gets us to the last element in the linked list
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	// This is assuming we have no tail pointer and we are just deleting the last
	// node.
	public void deleteNode() {
		System.out.println("Inside the deleteNode");
		Node curr, prev;
		curr = head;
		prev = null;

		// If there are no nodes in the linked list we don't do anything
		if(head == null) {
			return;
		}
		
		// This gets us to the last element in the linked list
		// and allows us to have a reference to the node before
		// so that we can delete the node we are currently on.
		System.out.println("Before the while loop inside of the deleteNode");
		while (curr.next != null) {
			System.out.println("Curr: " + curr.printNode());
			prev = curr;
			curr = curr.next;
		}
		System.out.println("After the while loop inside of the deleteNode");

	}

	public void printLinkList() {
		System.out.print("Linked List: ");
		while (head.next != null) {
			System.out.print(head.value + ", ");
			head = head.next;
		}
		// for the last value
		System.out.print(head.value);
	}
}
