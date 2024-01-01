package assign8;

public class Recursion {

	public static int sumOfDigit(int n) {
		if (n == 0)
			return 0;
		int sum = n % 10 + sumOfDigit(n / 10);
		return sum;
	}

	public static int square(int n) {
		if (n == 1)
			return 1;
		return square(n, (n-1)*n);
	}

	private static int square(int n, int m) {
		if (m == 0)
			return n;
		return square(n + 1, m - 1);
	}

	public static int factorial(int n) {
		if (n < 0)
			return -1;
		if (n == 1)
			return 1;
		return n * helperFact(n - 1);
	}

	private static int helperFact(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static boolean palindrome(int n) {
		if(n==reverse(n,0)) 
		return true	;
		return false;
		
	}

	private static int reverse(int n , int temp) {
		if(n==0) {
			return temp;
		}
		temp = (temp*10)+(n%10);
		return reverse(n/10 , temp);
	}

       
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfDigit(25));
		System.out.println(square(36));
		System.out.println(factorial(7));
		System.out.println(palindrome(3));
		System.out.println(palindrome(16461));
		// System.out.println(sumOfDigit(35678));

	}

}
