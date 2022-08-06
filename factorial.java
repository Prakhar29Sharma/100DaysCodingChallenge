import java.util.Scanner;

public class factorial{

	static int factorial(int n){
		if (n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("Enter a Number : ");
		num = input.nextInt();
		
		if(num < 0)
			System.out.println("number must be greater than zero!");
		else
			System.out.println("factorial of " + num + " is " + factorial(num));
		return;
	}
}
