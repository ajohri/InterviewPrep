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

		System.out.println("Before the while loop inside of the deleteNode");
		// This gets us to the last element in the linked list
		// and allows us to have a reference to the node before
		// so that we can delete the node we are currently on.
		while (curr.next != null) {
			System.out.println("Curr: " + curr.printNode());
			prev = curr;
			curr = curr.next;
		}
		System.out.println("After the while loop inside of the deleteNode");

	}

	public String printLinkList() {
		StringBuilder sb = new StringBuilder();
		sb.append("Linked List: ");
		while (head.next != null) {
			sb.append(head.value + ", ");
			head = head.next;
		}
		// for the last value
		sb.append(head.value);

		return sb.toString();
	}
}
