/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the binary search tree.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Insert the data into the binary search tree
b. Show the contents using In-oder traversal
c. Show the contents using pre-order traversal
d. Show the contents using Post-order traversal
 */
package assign9;

public class BinarySearchTree<T extends Comparable<T>> {
	private Node root;
	
	public class Node {
		Node left,right;
		T data;
		public Node(T data) {
			this.data = data;
			left = right = null;
		}
		
		
	}
	public BinarySearchTree(){
		root=null;
	}
	
	public void insert(T ele) {
		Node newNode = new Node(ele);
		if(isEmpty()) {
			System.out.println("Empty tree... inserting as root");
			root = newNode;
		}
		else {
			insert(root,newNode);
		}
	}
    
	private void insert(Node node, Node newNode) {
		if(node.data.compareTo(newNode.data)<0) {
			if(node.right==null) {
				node.right = newNode;
			}else {
				insert(node.right, newNode);
			}
		}else {
			if(node.left == null) {
				node.left = newNode;
			}else {
				insert(node.left, newNode);
			}
		}
		
	}
	public void inorder() {
		if(isEmpty()) {
			System.out.println("Empty tree");
		}
		else {
			inorder(root);
		}
	}
	
	private void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public void preorder() {
		if(isEmpty()) {
			System.out.println("Empty tree");
		}
		else {
			preorder(root);
		}
	}
	
	private void preorder(Node node) {
		if(node==null) {
			return;
		}
		
		System.out.print(node.data+" ");
		inorder(node.left);
		inorder(node.right);
	}
	public void postorder() {
		if(isEmpty()) {
			System.out.println("Empty tree");
		}
		else {
			postorder(root);
		}
	}
	
	private void postorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		inorder(node.right);
		System.out.print(node.data+" ");
	}

	private boolean isEmpty() {
		return root==null;
	}
}
