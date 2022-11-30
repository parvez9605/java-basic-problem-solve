
public class PalindromeCheck {
	// A palindrome string is the same string backwards or forwards.
	public static void main(String[] args) {
		checkPalindrome("RadAr");
		checkPalindromeInt(35533);

	}
	
	public static void checkPalindrome(String str) {
		String reverseStr = "";
		int strLen = str.length();
		for(int i = strLen - 1; i>=0; --i) {
			reverseStr = reverseStr+str.charAt(i);
		}
		
		if(reverseStr.toLowerCase().equals(str.toLowerCase())) {
			System.out.println(str+" is a palindrome string");
		}else {
			System.out.println(str+" is not a palindrome string");
		}
	}
	
	public static void checkPalindromeInt(int num) {
		int reverseNum = 0, reminder;
		int originalNum = num;
		while(num!=0) {
			reminder = num%10;
			reverseNum = reverseNum*10 + reminder;
			num = num/10;
		}
		
		if(originalNum == reverseNum) {
			System.out.println(originalNum+" is a palindrome number");
		}else {
			System.out.println(originalNum+" is not a palindrome number");
		}
	}
}
