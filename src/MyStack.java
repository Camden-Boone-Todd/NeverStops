public class MyStack {
	// stack is FILO
	// first in
	// last out
	private Object[] items;
	private int top;
	
	public MyStack(int size) {
		if (size < 1) {
			// FIXME maybe there is a better way
			size = 10;
		}
		items = new Object[size];
		top = 0;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == items.length;
	}
	
	public Object pop() {
		if (isEmpty())
			return null;
		Object r = items[top - 1];
		top -= 1;
		return r;
	}
	
	public boolean push(Object o) {
		if (isFull())
			return false;
		
		items[top] = o;
		top += 1;
		return true;
	}
	
	public void displayElements() {
		for (int i = 0; i < top; ++i) {
			System.out.println(items[top - i - 1]);
		}
	}
	
}