package LinkedList;

public class Main {
	public static void main(String[] args) {
		Node test1node = creationTest();
		System.out.println(test1node.printNode());
	}
	
	public static Node creationTest()
	{
		return new Node(0);
	}
}
