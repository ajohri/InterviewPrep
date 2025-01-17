package Stack;

public class StackArray {
	int size;
	int[] stack;
	int top_index;
	
	public StackArray(int input_size) {
		size = input_size;
		stack = new int[input_size];
		top_index = 0;
	}
	
	public void push(int value) {
		stack[top_index] = value;
		top_index++;
	}
	
	public int pop() {
		if(isEmpty()) { 
			// The Stack is empty right now and so there is nothing to pop
			return (Integer) null;
		}
		int ret = stack[top_index];
		top_index--;
		return ret;
	}
	
	public boolean isEmpty()
	{
		if(top_index != 0) {
			return false;
		} else
		{
			return true;
		}
	}
}
