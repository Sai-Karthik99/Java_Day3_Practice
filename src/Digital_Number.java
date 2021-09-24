import java.util.Scanner;

public class Digital_Number
{
	

	public static void main(String[] args) 
	{
		int n,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(sum=0;n>0;n=n/10) 
		{
			sum = sum+n%10;
		
		}
		System.out.println("Sum of digits:"+sum);

	}

}
