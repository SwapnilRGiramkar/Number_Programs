//Count a number using Methods
import java.util.Scanner;
class CountMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		System.out.println(count(num));
	}
	public static int count(int num)
	{
		int count=0;
		return count=(int)Math.log10(num)+1;
	}
}
