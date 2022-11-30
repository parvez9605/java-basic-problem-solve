
public class EvenOddNumber {

	public static void main(String[] args) {
		int a[] = {5,6,7,8,9,10,11,12,13};
		int count1 = 0, count2 = 0;
		 for(int i = 0; i<a.length; i++) {
			 if(a[i]%2 == 0) {
				 count1++;
			 }else {
				 count2++;
			 }
		 }
		System.out.println("Total even number: " + count1);
		System.out.println("Total odd number: " + count2);
	}

}
