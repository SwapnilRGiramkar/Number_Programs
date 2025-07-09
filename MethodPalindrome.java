//Using Method palindrome code
import java.util.Scanner;
class PaliRec
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(palindrome(num));
	}
	public static boolean palindrome(int num)
	{
		boolean flag=false;
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num/=10;
			if(rev==temp)
				flag=true;
		}
		if(flag)
			return true;
		else 
			return false;
	}
}
