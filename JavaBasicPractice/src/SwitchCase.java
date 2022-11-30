
public class SwitchCase {

	public static void main(String[] args) {
		int week = 5;
		
		switch (week) {
		case 1:
			System.out.println("Friday");
			break;
		case 2:
			System.out.println("Saturday");
			break;
		case 3:
			System.out.println("Sunday");
			break;
		case 4:
			System.out.println("Monday");
			break;
		case 5:
			System.out.println("Tuesday");
			break;
		case 6:
			System.out.println("Wednesday");
			break;
		case 7:
			System.out.println("Thursday");
			break;

		default:
			System.out.println("Wrong Day !!!!!!!");
			break;
		}

	}

}
