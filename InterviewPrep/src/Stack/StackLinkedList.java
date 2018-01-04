package Stack;

import java.util.LinkedList;

public class StackLinkedList {
	LinkedList<Integer> stack = new LinkedList<Integer>();
	int max_size;
	int curr_size;
	
	public StackLinkedList(int size) {
		max_size = size;
		curr_size = 0;
	}
	
	public int pop() {
		//Nothing to pop
		if(stack.isEmpty()) {
			return (Integer) null;
		} else {
			int temp = stack.getLast();
			stack.removeLast();
			curr_size--;
			return temp;
		}
	}
	
	public void push(int value) {
		// Don't do anything
		if(isFull()) {
			return;
		} else {
			stack.push(value);
			curr_size++;
		}
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public boolean isFull() {
		return curr_size == max_size -1;
	}
}
