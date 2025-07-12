//This Program gives Leap Year or Not
import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		if(isLeap(num))
		{
			System.out.println("Leap Year");
		}
		else 
			System.out.println("Not Leap Year");
	}
	public static boolean isLeap(int num)
	{
		return ((num%4==0 && num%100 !=0) || num%400==0);
	}
}
