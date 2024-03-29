package SortedSingularLL;

import java.util.List;

public class SortedSingularLL {
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insert(int ele) {
		Node newNode = new Node(ele);
		if(isEmpty() || ele<head.data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next!=null && curr.next.data<ele) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
	}
	
	public void addAll(List<Integer> lists) {
		for(int X : lists) {
			insert(X);		
		}
	}
	
	public int deleteAtLast() throws SortedListException {
		if(isEmpty()) {
			throw new SortedListException("Empty List cannot remove");
		}
		if(head.next == null) {
			int ele = head.data;
			head = null;
			return ele;
		}
		Node last = head;
		while(last.next.next!=null) {
			last = last.next;
		}
		int ele = last.next.data;
		last.next = null;
		return ele;
		
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node curr = head;
		while(curr!=null) {
			result.append(curr.data).append(",");
			curr = curr.next;
		}
		if(result.length()>0) {
			result.setLength(result.length()-2);
		}
		return result.toString();
	}
	
	
}
