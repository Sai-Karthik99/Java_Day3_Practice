import java.util.Scanner;

public class Even_Num 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int n = sc.nextInt();
		int lastnum=0;
		while(n>0)
		{
			lastnum = n%10;
			
			if(lastnum%2==0)
			{
				System.out.println(lastnum);
			}
			n=n/10;
			
			
		}

	}

}
