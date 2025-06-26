//This Program gives First Maximum number in program
import java.util.Scanner;
class FirstMax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		System.out.println("First Maximum Number : "+firstMax(num));
	}
	public static int firstMax(int num)
	{
		int temp=num;
		int max1=Integer.MIN_VALUE;
		while(temp!=0)
		{
			int last =temp%10;
			if(last>max1)
			{
				 max1=last;
			}
			temp/=10;
		}
		return max1;
	}
}
