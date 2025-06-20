import java.util.Scanner;
class ProductOfTwoNumbers
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number ");
		int b=sc.nextInt();
		System.out.println("Product Of two Number : "+numProduct(a,b));
	}
	public static int numProduct(int a,int b)
	{
		return a*b;
	}
}
