package tree;

public class levelOrderTraversal {
	Node root;
	
	public levelOrderTraversal() {
		root = null;
	}
	
	public levelOrderTraversal(int item) {
		root = new Node(item);
	}
	
	static class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	// Function to print nodes at given level
	public void printGivenLevel(Node root, int level) {
		if(root == null) {
			return;
		}
		else if(level == 1) {
			System.out.println(root.key + " ");
		}
		printGivenLevel(root.left, level-1);
		printGivenLevel(root.right, level-1);
	}
	
	// Function to get height of tree
	public int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		int lheight = getHeight(root.left);
		int rheight = getHeight(root.right);
		
		if(lheight > rheight) {
			return lheight +1;
		}
		return rheight + 1;
	}
	
	// Printing all nodes at all levels
	public void printLevelOrder() {
		if(root == null) {
			return;
		}
		int height = getHeight(root);
		for(int i = 0; i<=height; i++) {
			printGivenLevel(root , i);
		}
	}
	
	public static void main(String args[]) {
		levelOrderTraversal tree = new levelOrderTraversal();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Level order traversal of binary tree is ");
	    tree.printLevelOrder();
	}
}
