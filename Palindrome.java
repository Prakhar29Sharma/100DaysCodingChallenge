import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// Declaration //
		int n, num, rev = 0, rem;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number : ");

		// Input
		n = input.nextInt();
		//num = n;

		/* while loop starts here */
		while(n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		/* while loop ends here */

		if(num == rev)
			System.out.println(num + " is palindrome!");
		else 
			System.out.println(num + " is not a palindrome!");

		return;

	}
}
