package StackLL;

public class StackUsingLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node top ;
	private int maxElement;
	public boolean isEmpty() {
		return top==null;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Empty List");
			return -1;
		}
		return top.data;
	}
	
	public void push(int ele) {
		Node newNode = new Node(ele);
		if(isEmpty()) {
			top=newNode;
			maxElement = ele;
			return;
		}
		newNode.next = top;
		top = newNode;
		maxElement = Math.max(ele, maxElement);
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack");
		}	
		if(top.data == maxElement) {
			findNewMax();
		}
		int ele = top.data;
		top = top.next;
		
		return ele;
	}
	public int getMax() {
		return maxElement;
	}
	private void findNewMax() {
		Node curr = top.next;
		maxElement = Integer.MIN_VALUE;
		
		while(curr!=null) {
			maxElement = Math.max(maxElement, curr.data);
			curr = curr.next;
		}
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
		}
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
}
