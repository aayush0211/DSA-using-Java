package tester;

import java.util.Scanner;

import assign9.BinarySearchTreeAll;

public class BinaryTreeAllTest {

	public static void main(String[] args) {
		BinarySearchTreeAll<Integer> tree = new BinarySearchTreeAll<>();
		try(Scanner sc = new Scanner(System.in)){
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Choose an operation: \n1) Insert the data into the binary search tree\r\n"
						+ "2) Show the contents using In-oder traversal\r\n"
						+ "3) Show the contents using pre-order traversal\r\n"
						+ "4) Show the contents using Post-order traversal \n"
						+ "5)Get height of tree\n"
						+ "6)Get height of node\n"
						+ "7)Search element by BFS\n"
						+ "8)Search element by DFS\n"
						+ "9)Binary search by element\n0)Exit");
			try {
				switch(sc.nextInt()) {
				case 1: System.out.println("enter element");
				tree.insert(sc.nextInt());  
					break;
				case 2: tree.inOrder();
					break;
				case 3: tree.preOrder();
					break;
				case 4: tree.postOrder();
					break;
				case 5: System.out.println(tree.height()); 
				break;
				case 6:System.out.println("enter element ");
				Integer num = sc.nextInt();
				System.out.println("height of this element is : "+tree.height(num));
					break;
				case 7:System.out.println("enter element to be found : ");
		               System.out.println("element present : "+tree.bfs(sc.nextInt()));		
					break;
				case 8:System.out.println("enter element to be found : ");
				       System.out.println("element present : "+tree.dfs(sc.nextInt()));
					break;
				case 9:
					System.out.println("enter element : ");
					System.out.println("element is : "+tree.binSearch(sc.nextInt()));
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
