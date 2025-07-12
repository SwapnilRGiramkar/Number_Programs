//This program gives Positive Negative and Zero Number.
import java.util.Scanner;
class PosNegZero
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		System.out.println(detect(num));
	}
	public static String detect(int num)
	{
		String op= num>0 ? "Positive" : (num<0 ? "Negative" : "Zero");
		return op;
	}
}
