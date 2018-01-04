package LinkedList;

public class Node {
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public String printNode() {
		return "Node Value: "+value;
	}
}
