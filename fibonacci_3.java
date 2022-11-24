import java.util.Scanner;
class E
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter upper limit");
		int n=scn.nextInt();

		int a=0;
		int b=1;
		int c=0;

		if (n==1) 
		{
			System.out.print(0);
			return;
		}
		System.out.print(a+" "+b);
		for ( ; ; ) 
		{
			c=a+b;
			if (c==n) 
			{
				System.out.print("is belongs to Fibonacci Number");
				break;
			}
			if (c>n) 
			{
				System.out.print("is not belongs to Fibonacci Number");
				break;
			}
			a=b;
			b=c;
		}

		
	}
}