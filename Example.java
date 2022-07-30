import java.util.Scanner;

public class Example {
	public static void main(String[] args)
	{
		int n, i, j, k, space;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter height of triangle : ");
		n = input.nextInt();

		int[][] T = new int[n][n+1];

		for (i = 0; i < n; i++)
		{
			for(j = 0; j < n+1; j++)
			{
				if(i == 0)
				{
					if(j == 0)
					{
						T[i][j] = 1;
					} else {
						T[i][j] = 0;
					}
				}
				else if(i == 1)
				{
					if(j == 0 || j == 1)
					{
						T[i][j] = 1;
					}
					else {
						T[i][j] = 0;
					}
				} else {
					if(j == 0 || j == i)
					{
						T[i][j] = 1;
					} else {
						T[i][j] = T[i-1][j-1] + T[i-1][j];
					}
				}
			}
		}

		space = n+1/2;

		for(i = 0; i < n; i++)
		{
			for(k = space; k > 0; k--)
			{
				System.out.print(" ");
			}
			for(j = 0; j < n+1; j++)
			{
				//System.out.print(" " + T[i][j]);
				if(T[i][j] == 0)
				{
					System.out.print("");
				} else {
					System.out.print(" " + T[i][j]);
				}
			}
			System.out.println("");
			space-=1;
		}

	}
}