package tree;
import java.util.Stack;

public class preOrderTraversal {
	public preOrderTraversal() {
		this.root = null;
	}
	
	Node root;
	static class Node {
		int key;
		Node left, right;
		public Node(int item) {
			this.key = item;
			this.left = this.right = null;
		}
	}
	
	public boolean isLeaf(Node node) {
		if(node.left == null && node.right == null) {
			return true;
		}
		return false;
	}
	
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while(!s.isEmpty()) {
			Node temp = s.peek();
			System.out.println(temp.key + " ");
			s.pop();
			if(temp.right != null) {
				s.push(temp.right);
			}
			if(temp.left != null) {
				s.push(temp.left);
			}
		}
		
		while(!s.isEmpty()) {
			Node temp = s.peek();
			System.out.println(temp.key + " ");
			s.pop();
		}
	}
	
	public static void main (String args[]) {
		preOrderTraversal bt = new preOrderTraversal();
		bt.root = new Node(45);
		bt.root.left = new Node(25);
		bt.root.left.left = new Node(15);
		bt.root.left.left.left = new Node(5);
		
		bt.root.left.right = new Node(35);
		bt.root.right = new Node(55);
		bt.root.right.right = new Node(65);
		bt.root.right.right.left = new Node(77);
		bt.root.right.right.right = new Node(88);
		
		bt.preOrder(bt.root);
	}
}
