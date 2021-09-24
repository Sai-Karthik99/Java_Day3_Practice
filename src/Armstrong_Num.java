import java.util.Scanner;

public class Armstrong_Num
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		boolean r = isArmstrong(n);
		if(r)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is not Armstrong");
		

	}
	static int countNum(int n) {
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	static boolean isArmstrong(int x)
	{
		int cn =countNum(x);
		int t=x;
		int sum=0;
		while(t>0) 
		{
			int r=t%10;
			sum = sum+pow(r,cn);
			t=t/10;
		}
		if(sum==x)
			return true;
		else
			return false;
		
	}
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}
