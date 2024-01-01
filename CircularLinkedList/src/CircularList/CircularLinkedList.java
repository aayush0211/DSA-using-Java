package CircularList;

public class CircularLinkedList {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	
	public void insert(int ele) {
		Node newNode = new Node(ele);
		if(head==null) {
			head=newNode;
			newNode.next = head;
			return;
		}
		if(head.next==head) {
			head.next = newNode;
			newNode.next = head;
			return;
		}
		Node temp = head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}
	
	public void insertAtfirst(int ele) {
		Node newNode = new Node(ele);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtlast(int ele) {
		Node newNode = new Node(ele);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}
	public void insertAtPosi(int ele , int posi) {
		Node newNode = new Node(ele);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp = head;
		for(int i=0;i<posi;i++) {
			temp=temp.next;
		}
		if(temp.next == head) {
		temp.next = newNode;
			newNode.next = head;
		}
		temp.next = newNode;
		
	}
	
	public int deleteAtFirst() {
		if(head == null) {
			throw new RuntimeException("No element in the list!!!");
		}
		if(head.next == null) {
			int ele = head.data;
			head = null;
			return ele;
		}
		int ele = head.data;
			head = head.next;
		return ele;
	}
	public int deleteAtLast() {
		if(head == null) {
			throw new RuntimeException("No element in the list!!!");
		}
		if(head.next.next == head) {
			int ele = head.next.data;
			head.next = head;
			return ele;
		}
		Node temp = head;
		while(temp.next.next!=head) {
			temp = temp.next;
		}
			
		int ele = temp.next.data;
		temp.next = head;
		return ele;
	}
	public int deleteAtPosi(int posi) {
		if(head == null) {
			throw new RuntimeException("No element in the list!!!");
		}
		if(head.next.next == head) {
			int ele = head.next.data;
			head.next = head;
			return ele;
		}
		Node temp = head;
		for(int i=0;i<posi-1;i++) {
			temp = temp.next;
		}
		int ele = temp.data;
		temp.next = temp.next.next;
		return ele;
	}
	
	public void Display() {
		if(head == null) {
			throw new RuntimeException("No element in the list!!!");
		}
		Node temp = head;
		do {
			System.out.println(temp.data+"->");
           temp=temp.next;
		}while(temp!=head);
//		while(temp.next != head) {
//			System.out.println(temp.data+"->");
//			temp=temp.next;
//		}
		System.out.println();
	}
}
