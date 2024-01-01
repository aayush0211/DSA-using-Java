package tester;

import java.util.Scanner;

import assign9.BinarySearchTree;



public class TesterTree {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Choose an operation: \n1) Insert the data into the binary search tree\r\n"
						+ "2) Show the contents using In-oder traversal\r\n"
						+ "3) Show the contents using pre-order traversal\r\n"
						+ "4) Show the contents using Post-order traversal \n0)Exit");
			try {
				switch(sc.nextInt()) {
				case 1: System.out.println("enter element");
				tree.insert(sc.nextInt());  
					break;
				case 2: tree.inorder();
					break;
				case 3: tree.preorder();
					break;
				case 4: tree.postorder();
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
