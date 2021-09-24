import java.util.Scanner;

public class Factorial_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		while(n>0) {
			int d= n%10; 
			n=n/10;
			int f=1;
			for(int i=1;i<=d;i++)
			{
				f=f*i;
			}
			System.out.println("Factorial of " +d+ " = " +f);
		}

	}

}
