package stack;

public class arrayStack {
	final int MAX = 1000;
	static int top;
	int a[] = new int[MAX];
	
	arrayStack() {
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top < 0) {
			System.out.println("Stack is empty!");
			return true;
		}
		System.out.println("Stack is not empty");
		return false;
	}
	
	public boolean push(int d) {
		if(top >= MAX) {
			System.out.println("Stack overflow!");
			return false;
		}
		a[++top] = d;
		System.out.println(d + " pushed to stack");
		return true;
	}
	
	public int pop() {
		if(top < 0) {
			System.out.println("Stack underflow!");
			return 0;
		}
		int x = a[top--];
		return x;
	}
	
	public void printStack() {
		if(top < 0) {
			System.out.println("Stack is empty! Nothing to print");
			return;
		}
		int temp = top;
		while(temp >=0) {
			System.out.println(a[temp]);
			temp--;
		}
	}
	
	public static void main(String args[]) {
		arrayStack s = new arrayStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.printStack();
		
		System.out.println(s.pop() + " popped from stack");
		s.printStack();
	}
}
	
