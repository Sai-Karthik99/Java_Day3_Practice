import java.util.Scanner;

public class firstToLast
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a+1;i<=b-1;i++)
		{
			System.out.println(i);
		}

	}

}
