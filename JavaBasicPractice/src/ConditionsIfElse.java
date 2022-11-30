public class ConditionsIfElse {
	public static void main(String args[]) {
		int a = 35;
		
		// conditional statement even number
		if(a%2 == 0) {
			System.out.println("A is an even number");
		}else {
			System.out.println("A is an odd number");
		}
		
		// conditional statement largest number
		int x = 23, y = 25, z = 22;
		if(x>y && x>z) {
			System.out.println("X is largest");
		}else if (y>x && y>z) {
			System.out.println("Y is largest number");
		}else {
			System.out.println("Z is largest number");
		}
	}

}
