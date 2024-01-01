package Tester;

import CircularList.CircularLinkedList;

public class CircularListTester {

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		
		try {
			cl.insert(10);
			cl.insert(20);
			cl.insert(30);
			cl.insert(40);
			cl.insert(60);
			cl.insertAtfirst(5);
			cl.insertAtlast(70);
			//cl.insertAtPosi(25, 2);
			cl.Display();
			
			
			cl.deleteAtFirst();
			cl.deleteAtLast();
			cl.deleteAtPosi(2);
			
			cl.Display();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
