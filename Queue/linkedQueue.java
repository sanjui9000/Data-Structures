package queue;

public class linkedQueue {
	Node front = null;
	Node rear = null;
	
	Node head;
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		if(rear == null && front == null) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int x) {
		Node new_node = new Node(x);
		if(isEmpty()) {
			front = rear = new_node;
			return;
		}
		rear.next = new_node;
		rear = new_node;
	}
	
	public Node dequeue() {
		if(isEmpty()) {
			return null;
		}
		Node temp = front;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return temp;
	}
	
	public void printQueue() {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		linkedQueue q=new linkedQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        System.out.println("Dequeued item is "+ q.dequeue().data);
	}
}
