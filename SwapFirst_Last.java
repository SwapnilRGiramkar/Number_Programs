//This program swap First and last digit of given number.
//Its important program 
import java.util.Scanner;
//Swap first and Last digit 
class Swap
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int ld=num%10;
		int count=(int)Math.log10(num);
		System.out.println(count);
		int first=(int)(num / Math.pow(10,count));
		int last=(int)(num % Math.pow(10,count));
		last=last/10;

		int swap=(int)(ld * Math.pow(10,count)+last*10+first);

		System.out.println(temp);
		System.out.println(swap);
	}
}
