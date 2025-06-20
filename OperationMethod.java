import java.util.Scanner;
class OperationMethod
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		int a =sc.nextInt();
		System.out.println("Enter the 2nd number ");
		int b =sc.nextInt();
		System.out.println("1.Addition 2.Substraction 3.Multiplication 4.devidation " );
		int choice =sc.nextInt();

		switch(choice)
		{
			case(1):
			{
				System.out.println("Addition : "+add(a,b));
				break;
			}
			case(2):
			{
				System.out.println("Substraction : "+sub(a,b));
				break;
			}
			case(3):
			{
				System.out.println("Multiplication : "+mul(a,b));
				break;
			}
			case(4):
			{
				System.out.println("Dividation : "+devide(a,b));
				break;
			}
			default :
			{
				System.out.println("insufficient Information");
				break;
			}
		}
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int devide(int a,int b)
	{
		return a/b;
	}
}
