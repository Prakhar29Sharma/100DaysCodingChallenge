
import java.util.Scanner;

public class CheckAmstrong {
	/* main function starts */
	public static void main(String[] args){
		/* Declarations */
		Scanner input = new Scanner(System.in);
		int n, num, digit, sum;
		
		sum = 0;

		System.out.println("This program takes a number and checks if it is amstrong number or not");
		System.out.print("Enter a Number : ");
		// taking input //
		n = input.nextInt();
		num = n;

		/* loop starts here */
		while(n > 0){

			digit = n % 10;
			
			sum += digit*digit*digit;
			
			n/=10;

		 } /* loop end here*/

		// condition for amstrong number //
		if(num == sum)
			System.out.println(num + " is an Amstrong Number!");
		else
			System.out.println(num + " is not an Amstrong Number!");

		return;

	}
}
