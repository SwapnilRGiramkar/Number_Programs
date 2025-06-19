import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int count=(int)Math.log10(num)+1;

		while(temp!=0)
		{
			int last = temp%10;
			sum+=(int)Math.pow(last,count);
			temp/=10;
		}
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not ArmStrong Number");
	}
}
