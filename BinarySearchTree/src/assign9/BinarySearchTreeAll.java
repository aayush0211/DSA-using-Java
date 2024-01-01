package assign9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeAll<T extends Comparable<T>> {
	public static class Node<T> {
		private T data;
		private Node<T> left, right;

		public Node(T ele) {
			data = ele;
			left = right = null;
		}

		public String toString() {
			return "value : " + data;
		}

	}

	private Node<T> root;

	public BinarySearchTreeAll() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(T ele) {
		Node<T> newNode = new Node<>(ele);
		Node<T> trav = root;
		if (root == null) {
			root = newNode;
			return;
		}
		insert(trav, newNode);
	}

	private void insert(Node<T> node, Node<T> newNode) {

		if (node.data.compareTo(newNode.data) > 0) {
			if (node.left == null) {
				node.left = newNode;
			} else {
				insert(node.left, newNode);
			}
		} else {
			if (node.right == null) {
				node.right = newNode;
			} else {
				insert(node.right, newNode);
			}

		}
	}
	
	public void deleteAll() {
		if(isEmpty()) {
			System.out.println("tree already empty!!!");
			return;
		}
		deleteAll(root);
		
	}

	private void deleteAll(Node<T> node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
		deleteAll(node.left);
		deleteAll(node.right);
		node.left=null;
		node.right=null;
		node=null;
	}
	
	public Node<T> getParentChildNode(T ele) {
		if(isEmpty()) {
			throw new RuntimeException("empty tree!!!");
		}
		Node<T> trav=root,parent=null;
		while(trav!=null) {
			if(trav.data.compareTo(ele)==0) {
			return parent;	
			}
			parent=trav;
			if(trav.data.compareTo(ele)>0) {
				trav=trav.left;
			}
			else {
				trav=trav.right;
			}
		}
		return null;
	}
	
	public void deleteNode(T ele) {
		Node<T> temp = binSearch(ele);
		Node<T> parent = getParentChildNode(ele);
		
		if(temp==null) {
			System.out.println("node not found!!");
			return;
		}
		Node<T>succ=null,trav=temp;
		if(temp.left!=null&&temp.right!=null) {
			succ=temp.right;
			trav=temp.right;
			while(trav.left!=null) {
				
				trav=trav.left;
				succ=trav;
			}
			
			
		}
	}

	public void preOrder() {
		if (isEmpty()) {
			System.out.println("tree empty!!");
			return;
		}

		preOrder(root);
	}

	private void preOrder(Node<T> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void inOrder() {
		if (isEmpty()) {
			System.out.println("empty tree");
			return;
		}
		inOrder(root);
	}

	private void inOrder(Node<T> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void postOrder() {
		if (isEmpty()) {
			System.out.println("empty tree");
			return;
		}
		postOrder(root);
	}

	private void postOrder(Node<T> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public Node<T> binSearch(T ele) {

		if (isEmpty()) {
			System.out.println("tree is empty!!!");
			return null;
		}
		Node<T> trav = root;
		while (trav != null) {
			if (trav.data.compareTo(ele) == 0) {
				return trav;
			}
			else if (trav.data.compareTo(ele) > 0) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		return null;
	}

	public int height(T ele) {
		Node<T> temp = binSearch(ele);
		if (temp == null) {
			return 0;
		}

		return height(temp);
	}

	public int height() {
		return height(root);
	}

	private int height(Node<T> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int h1 = height(node.left); // pre
		int h2 = height(node.right);
		int max = h1 > h2 ? h1 : h2;
		System.out.println("h1  : "+h1 +" h2 : "+h2+" max : "+max);
		return max + 1;
	}

	public boolean bfs(T ele) {
		if (isEmpty()) {
			return false;
		}
		Queue<Node<T>> queue = new LinkedList<>();
		Node<T> trav = root;
		queue.offer(trav);
		while (!queue.isEmpty()) {
			trav = queue.poll();
			if (trav.data.compareTo(ele) == 0) {
				return true;
			}
			if (trav.data.compareTo(ele) > 0) {
				if (trav.left != null) {
					queue.offer(trav.left);
				}
			} else {
				if (trav.right != null) {
					queue.offer(trav.right);
				}
			}

		}
		return false;
	}

	public boolean dfs(T ele) {
		if (isEmpty()) {
			return false;
		}
		Stack<Node<T>> stack = new Stack<>();
		Node<T> trav = root;
		stack.push(trav);
		while (!stack.isEmpty()) {
			trav = stack.pop();
			if (trav.data.compareTo(ele) == 0) {
				return true;
			}
			if (trav.data.compareTo(ele) > 0) {
				if (trav.left != null)
					stack.push(trav.left);
			} else {
				if (trav.right != null)
					stack.push(trav.right);
			}
		}
		return false;
	}

}
