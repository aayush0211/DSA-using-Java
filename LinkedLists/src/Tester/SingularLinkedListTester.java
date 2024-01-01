package Tester;

import SingularLL.SingularLinkedList;

public class SingularLinkedListTester {

	public static void main(String[] args) {
		
		SingularLinkedList lists = new SingularLinkedList();
		
		try {
			lists.insert(20);
			lists.insert(30);
			lists.insert(40);
			lists.insert(50);
			lists.insert(60);
			lists.insert(30);
			lists.insert(20);
			lists.insert(30);
			lists.insert(50);
			
			lists.Display();
			
		    lists.reverseList();
		    System.out.print("Reversed: ");
		    lists.Display();
		    lists.removeElements(30);
			
		 lists.Display();
		 System.out.println("Size "+lists.Size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}