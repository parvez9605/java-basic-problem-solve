
public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 20, b = 30;
		
		// swap between a & b
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Update value of a: "+a);
		System.out.println("Update value of b: "+b);
		
		int x = a + b; // use of operator (+)
		
		System.out.println("Sum of a & b: "+x);
		
		System.out.println("Sum is: " + (a + b));
		
		System.out.println(a>b);
		System.out.println(a<b);
		
		System.out.println(a++); // post-increment
		System.out.println(++a); // pre-increment

	}

}
