import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=last+rev*10;
			num/=10;
		}
		System.out.println("Reverse : "+rev);
	}
}

