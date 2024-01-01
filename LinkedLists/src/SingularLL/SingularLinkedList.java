package SingularLL;

public class SingularLinkedList {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		public Node() {
			next = null;
			this.data = 0;
		}
	}
	Node head=null;
	private int cnt=0;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insert(int ele) {
		Node newNode = new Node(ele);
		if(isEmpty()) {
			head=newNode;
			return;
		}
		Node last = head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next = newNode;
	}
	
	public void insertAtFirst(int ele) {
		Node newNode = new Node(ele);
		newNode.next=head;
		head = newNode;
	}
	public void insertAtLast(int ele) {
		Node newNode = new Node(ele);
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insertAtPosition(int ele, int pos) {
		Node newNode = new Node(ele);
		
		Node temp = head;
		for(int i=0;i<pos;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;		
	}
	
	public int deleteAtFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Emoty List");
		}
			int ele = head.data;
			if(head.next==null) {
				head = null;
			}
			return ele;
	}
	public int deleteAtLast() {
		if(isEmpty()) {
			throw new RuntimeException("Emoty List");
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		int ele = temp.next.data;
		temp.next = null;
		return ele;
	}
	public int deleteAtPosi(int posi) {
		if(isEmpty()) {
			throw new RuntimeException("Emoty List");
		}
		if(head.next==null) {
			int ele = head.data;
			head = null;
			return ele;
		}
		Node temp = head;
		for(int i=0;i<posi-1;i++) {
			temp = temp.next;
		}
		int ele = temp.next.data;
		temp.next = temp.next.next;
		return ele;
	}
	public void deleteAll() {
		head = null;
	}
	
	public void Display() {
		if(isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public Node reverseList() {
		Node curr = head;
		Node prev = null;
		
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev =curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	public Node removeElements(int val) throws CustomException {
		if(head==null) {
			throw new CustomException("Empty List");
		}
		Node dummy = new Node();
		dummy.next = head;
		Node curr = dummy;
		while(curr.next!=null) {
			if(curr.next.data == val) {
				curr.next = curr.next.next;
			}else {
			curr = curr.next;
			}
		}
		return dummy.next;
		
	}
	public int Size() {
		Node temp = head;
		while(temp!=null) {
			cnt++;
			temp=temp.next;
		}
		return cnt;
	}
	
}