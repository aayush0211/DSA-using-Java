package assign8;


public class RecursiveFunctions {
	public int sumOfDigits(int digit) {
		if(digit==0) {
			return 0;
		}
		else {
		return (digit % 10 + sumOfDigits(digit / 10));
		}
	}


 public int squareOfNumber(int num) {
	 if(num==0) {
		 return 1;
	 }else if(num==1) {
		 return num;
	 }
	 return num*(squareOfNumber(num));
}
 
 
}