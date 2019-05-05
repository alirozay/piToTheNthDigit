import java.util.Scanner;

public class piToTheNthDigit {

	public static void main(String[] args) {
		int n;
		do {
		Scanner keyboard = new Scanner(System.in);
		String pi = Double.toString(Math.PI);
		int maxLength = pi.length()-1;
		System.out.println("Find pi upto the digit entered below(minimum is 1 and maximum is "+maxLength+ "). Press 0 to quit");
		n = keyboard.nextInt();
		if(n>0 && n <=maxLength) {
		if(n==1) System.out.println(pi.substring(0, n));
		else System.out.println(pi.substring(0, n+1));
		} else System.out.println("Error. Please enter a number within those bounds");
		}while(n!=0);
		System.out.println("Thanks for testing it out!");
	}

}
