import java.util.Scanner;

public class PrimeTest{
	public static void main(String[] args) {
		
		boolean isPrime = true;
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		num = input.nextInt();
		
		
		if (num < 2) {
			isPrime = false;
		} else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = false;
				} 
			}
		}
		
		if(isPrime) {
			System.out.println("Prime Number!");
		} else {
			System.out.println("Not a Prime Number!");
		}
		
		return;
	}
}