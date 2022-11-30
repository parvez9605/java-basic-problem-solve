
public class FibonacciSequence {
	
	// A Fibonacci sequence is one in which each number is the sum of the two previous numbers.

	public static void printFibonnaci(int count) {
		int x = 0, y = 1, z = 1;
		for(int i  = 0; i<count; i++) {
			System.out.print(x+", ");
			x = y;
			y = z;
			z = x + y;
		}
	}
	
	public static void main(String[] args) {
		printFibonnaci(15);
	}

}
