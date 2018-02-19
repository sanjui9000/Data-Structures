package tree;

public class binaryTree {
	Node root;
	
	binaryTree() {
		root = null;
	}
	
	binaryTree(int key) {
		root = new Node(key);
		
	}
	
	static class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			this.key = item;
			this.left = this.right = null;
		}
	}
	
	public static void main(String args[]) {
		// Create a new binary tree with root = null
		binaryTree tree = new binaryTree();
		
		// Create root node of binary tree
		tree.root = new Node(1);
		
		// Current tree
		/* following is the tree after above statement
							 
					        1
					      /   \
					    null  null     */
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		// Current tree
		
		/* 2 and 3 become left and right children of 1
					        1
					      /   \
					     2      3
					   /    \    /  \
					 null null null null  */
		
		tree.root.left.left = new Node(4);
		
		// Current tree
		/* 4 becomes left child of 2
					        1
					    /       \
					   2          3
					 /   \       /  \
					4    null  null  null
				   /       \
				 null     null
					*/
	}
}
