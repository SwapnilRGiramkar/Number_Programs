//Pure logical Program using binary
import java.util.Scanner;
class PowerOf2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		System.out.println(power(num));
	}
	public static boolean power(int num)
	{
		return num>0 && (num & (num-1))==0;
	}
}
