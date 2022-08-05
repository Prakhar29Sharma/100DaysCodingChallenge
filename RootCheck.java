import java.util.Scanner;

public class RootCheck {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,D;
		
		System.out.println("This program checks if quad eqn have real roots");
		System.out.print("Enter values for a, b and c : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a == 0){
			System.out.println("value of a cannot be zero!");
			
		} else {
			D = b*b - 4*a*c;
			if (D < 0){
				System.out.println("Quadratic Eqn has no real roots!");
			} else {
				System.out.println("Quadratic Eqn has real roots!");
			}
			
		}
	}
}
