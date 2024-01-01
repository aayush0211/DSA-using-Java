package test;

import java.util.Scanner;

import assign7.DoublyLinkedList;

public class TestDoublyLL {

	public static void main(String[] args) {
		DoublyLinkedList<Double> lists = new DoublyLinkedList<>();
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Choose an operation: \n1)Show the contents of linked list\n"
						+ "2)Insert the data in the linked list\n3)Check how many elements are there in the linked list\n"
						+ "4)Check to see if linked list is empty \n 0)Exit");
			try {
				switch(sc.nextInt()) {
				case 1: lists.display();  
					break;
				case 2: System.out.println("Enter Element to insert"); 
					lists.insert(sc.nextDouble());
					break;
				case 3: int total = lists.totalElement();
					System.out.println("Total element in Linked list is: "+total);
					break;
				case 4:  boolean empty = lists.isEmpty();
				if(empty == true)
					System.out.println("Empty list");
				else { System.out.println("Not empty : elements are ");
					lists.display();
				}
					break;
				case 0: System.out.println("Thank You!!!");
				          exit = true;
					break;
					
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				sc.nextLine();
			}
		}

	}
	}

}
