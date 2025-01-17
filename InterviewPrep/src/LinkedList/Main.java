package LinkedList;

public class Main {
	public static void main(String[] args) {
//		Node test1node = creationTest();
//		System.out.println(test1node.printNode());
		
		LinkedList test1list = creationListTest();
		test1list.printLinkList();
	}
	
	public static Node creationTest()
	{
		return new Node(0);
	}
	
	public static LinkedList creationListTest() {
		LinkedList test = new LinkedList(0);
		Node tempTest = new Node(1);
		test.addNode(tempTest);
		tempTest = new Node(2);
		test.addNode(tempTest);
		test.deleteNode();
		return test;
	}
	
}
