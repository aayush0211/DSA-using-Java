package StackUsingLLTester;

import StackLL.StackUsingLL;

public class tester {

	public static void main(String[] args) {
		
		StackUsingLL ll = new StackUsingLL();
		
		try {
			
			ll.push(10);
			ll.push(20);
			ll.push(30);
			ll.push(25);
			ll.push(22);
			
		 System.out.println(ll.peek()+" Max : "+ll.getMax());
			ll.display();
			
			System.out.println("Popped ele "+ ll.pop());
			System.out.println(ll.peek()+" Max : "+ll.getMax());
			ll.display();
			System.out.println("Popped ele "+ ll.pop());
			System.out.println("Popped ele "+ ll.pop());
			System.out.println(ll.peek()+" Max : "+ll.getMax());
			
		
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
