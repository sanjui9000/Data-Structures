package stack;

public class linkedStack {
	class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	Node top = null;
	
	public boolean isEmpty() {
		if(top == null) {
			System.out.println("Stack is empty");
			return true;
		}
		System.out.println("Stack is not empty");
		return false;
	}
	
	public void push(int x) {
		if(top == null) {
			Node newTop = new Node(x);
			top = newTop;
			return;
		}
		Node newTop = new Node(x);
		newTop.next = top;
		top = newTop;
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("Stack underflow!");
			return 0;
		}
		int x = top.data;
		top = top.next;
		return x;
	}
	
	public static void main(String args[]) {
		System.out.println("Pushing stuff...");
        linkedStack stack = new linkedStack();
        for(int i=1;i<=10;i++){
            stack.push(i);
        }
        
        System.out.println("Popping stuff:");
        for(int i=1;i<=11;i++){
            if(!stack.isEmpty())
                System.out.println(stack.pop());
            else{
                System.out.println("Stack is now empty.");
                break;
            }
        }
	}
}