package linkedList;

public class LinkedList {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d) {
			data=d;
			next=null;
		}
	}
	
	// Print linked list
	public void printList() {
		if(head == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	/* Insert operations */
	
	// Insert item at beginning of list
	public void push(int d) {
		// Create a new node
		Node new_node = new Node(d);
		// Set new node's next as current head
		new_node.next=head;
		// Set current head as new node
		head = new_node;
	}
	
	// Insert item after a given node
	public void pushMiddle(Node key, int d) {
		if(key == null) {
			System.out.println("Given node cannot be empty!");
			return;
		}
		Node temp = head;
		while(temp!=key) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Key not found in the list!");
			return;
		}
		Node new_node = new Node(d);
		new_node.next = temp.next;
		temp.next = new_node;
		
	}
	
	// Insert item at the end of list
	public void pushEnd(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
	}
	
	/* Delete operations */
	
	// Delete a given key
	
	public void deleteKey(Node key) {
		if(key == null) {
			System.out.println("Given node cannot be null");
			return;
		}
		Node temp = head;
		if(temp.data == key.data) {
			head = temp.next;
			return;
		}
		Node prev = null;
		while(temp != null && temp.data != key.data) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Key not found in list");
			return;
		}
		prev.next = temp.next;
	}
	
	// Delete key at given position
	
	public void deletePos(int position) {
		if(head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		if(position == 0) {
			head = head.next;
			return;
		}
		Node temp = head;
		for(int i=0; temp!=null && i<position-1; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			System.out.println("Position does not exist");
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
	}
	
	// Get length of linked list
	
	public int getLength() {
		int count = 0;
		if(head == null) {
			System.out.println("Linked list is empty");
			return count;
		}
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	// Main method	
	public static void main(String args[]) {
				LinkedList list = new LinkedList();
				
				list.push(1);
				list.push(2);
				list.push(3);
				list.push(4);
				
				System.out.println("Old list:");
				list.printList();
				
				list.deletePos(3);
				
				System.out.println("New list:");
				list.printList();
				
				System.out.println("Length of list:");
				System.out.println(list.getLength());
	}

}
