import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int last=temp%10;
			rev=last+rev*10;
			temp/=10;
		}
		if(num==rev)
			System.out.println(num+"Its Palindrome Number");
		else
			System.out.println(num+"Not a Palindrome Number");
	}
}
