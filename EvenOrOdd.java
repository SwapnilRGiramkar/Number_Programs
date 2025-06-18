import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(isEvenOrOdd(num))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	public static boolean isEvenOrOdd(int num)
	{
		return num%2==0 ? true : false;
	}
}
