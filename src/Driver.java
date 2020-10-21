public class Driver {
	public static void main(String[] args) {
		MyStack ms = new MyStack(22);
		
		Integer i = 1;
		Integer i2 = 2;
		
		ms.push(i);
		ms.push(i2);
		
		Double d = 2.2;
		ms.push(d);
		ms.displayElements();
	}
}
