import java.util.Scanner;
class GretestOfThree
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a= sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		System.out.println("Enter the third Number :");
		int c= sc.nextInt();

		int max= a > b ? a : (b > c ? b : c);
		System.out.println("Gretest Of Three is : "+max);
	}
}
