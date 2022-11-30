
public class PrimeNumber {

	public static void main(String[] args) {
		// You can write a program to divide the given number n, by a number from 2 to n/2 and check the remainder. If the remainder is 0, then it’s not a prime number.
		int x = 29, y = 21;
		System.out.println(isPrime(x));
		System.out.println(isPrime(y));

	}
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		if(n == 2) {
			return true;
		} 
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
