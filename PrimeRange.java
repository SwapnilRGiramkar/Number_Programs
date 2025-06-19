import java.util.Scanner;
class PrimeRange
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Start Number : ");
		int start = sc.nextInt();
		System.out.println("Enter the last Number : ");
		int end=sc.nextInt();
		System.out.println("Range Of Prime Number");

		while(start > 0)
		{
			for(int i=start;i < end;i++)
			{
				if(i%2!=0 && i!=1)
				{
					System.out.println(i);
				}
			}
			break;
		}
	}
}

