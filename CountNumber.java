import java.util.Scanner;
class CountNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Number : ");
		int num = sc.nextInt();
		int count=0;
		count=(int)Math.log10(num)+1;
		System.out.println("Count of Number is : "+count);
	}
}
