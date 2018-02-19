package tree;
import java.util.Stack;

public class postOrderTraversal {
	Node root;
	
	static class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			this.key = item;
			this.left = this.right = null;
		}
		
		boolean isLeaf() {
			if(this.left == null && this.right == null) {
				return true;
			}
			return false;
		}
	}
	
	public postOrderTraversal() {
		this.root = null;
	}
	
	// Post order traversal
	public void POTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		Stack<Node> s = new Stack<Node>();
		s.push(node);
		
		while(!s.isEmpty()) {
			Node current = s.peek();
			
			if(current.isLeaf()) {
				Node temp = s.pop();
				System.out.println(temp.key + " ");
			}
			if(current.right != null) {
				s.push(current.right);
				current.right = null;
			}
			if(current.left != null) {
				s.push(current.left);
				current.left = null;
			}
		}
	}
	
	public static void main(String args[]) {
		postOrderTraversal bt = new postOrderTraversal();
		bt.root = new Node(45);
		bt.root.left = new Node(25);
		bt.root.left.left = new Node(15);
		bt.root.left.left.left = new Node(5);
		
		bt.root.left.right = new Node(35);
		bt.root.right = new Node(55);
		bt.root.right.right = new Node(65);
		bt.root.right.right.left = new Node(77);
		bt.root.right.right.right = new Node(88);
		
		bt.POTraversal(bt.root);
	}
}
