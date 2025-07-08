//Prime Number Using a Recursion
import java.util.Scanner;
class PrimeRec 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
    	System.out.println(Prime(num));

	}
	public static boolean Prime(int num)
	{
		return num%2==0 ? true : false;
	}
}
