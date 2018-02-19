package queue;

public class arrayQueue {
	int capacity;
	int front;
	int rear;
	int arr[];
	
	public arrayQueue(int capacity){
		this.capacity = capacity;
		this.front = -1;
		this.rear = -1;
		arr = new int[capacity];		
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			// System.out.println("Stack Underflow");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear == capacity-1) {
			// System.out.println("Stack Overflow");
			return true;
		}
		return false;
	}
	
	public void enqueue(int x) {
		if(isEmpty()) {
			front = rear = 0;
			arr[rear] = x;
		} else if(isFull()) {
			return;
		} else {
			rear = (rear+1) % capacity;
			arr[rear] = x;
		}
	}
	
	public int dequeue() {
		int ele;
		if(isEmpty()) {
			return 0;
		} else if(front == rear) {
			ele = arr[front];
			front = rear = -1;
			return ele;
		} else {
			ele = arr[front];
			front = (front + 1) % capacity;
			return ele;
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Nothing to print");
		}
		System.out.println("Printing array");
		for(int i=front; i<=rear; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		arrayQueue aQueue = new arrayQueue(10);
		aQueue.enqueue(2);
		aQueue.enqueue(3);
		aQueue.enqueue(7);
		aQueue.printQueue();
		aQueue.dequeue();
		aQueue.dequeue();
		aQueue.printQueue();
	}
}
