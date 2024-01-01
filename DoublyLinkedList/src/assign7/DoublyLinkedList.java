/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the doubly linked list.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the contents of doubly linked list
b. Insert the data in the doubly linked list
c. Check how many elements are there in the doubly linked list.
d. Check to see if doubly linked list is empty.
 */

package assign7;


public class DoublyLinkedList<T> {
	private Node<T> head; 
	public DoublyLinkedList() {
		this.head = null;
	}
	static class Node<T>{
		T data;
		Node<T> next, prev;
		Node(T d){
			this.data = d;
			next = null;
			prev = null;
		}
}
	public void insert(T i) {
		 Node<T> newNode = new Node<T>(i); 
		if(head == null) {
			this.head = newNode;
			return;
		}
		Node<T> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev=temp;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Empty list");
		}
		Node<T> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		System.out.println();
	}
	public int totalElement() {
		if(isEmpty()) {
			 return 0;
		}
		int cnt = 0;
		Node<T> temp = head;
		while(temp!=null) {
			cnt++;;
			temp=temp.next;
		}
		return cnt;
	}
	
}
