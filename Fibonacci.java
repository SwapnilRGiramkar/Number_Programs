import java.util.Scanner;
class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the end number");
		int end =sc.nextInt();
		int n1=0,n2=1,n3;

		for(int i=n1;i < end;i++)
		{
			System.out.println("Fibonacci : "+n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
