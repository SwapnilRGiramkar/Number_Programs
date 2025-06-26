//This Program gives First Minimum number of given number
import java.util.Scanner;
class FirstMin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		System.out.println("First Minimum number is : "+firstMin(num));
	}
	public static int firstMin(int num)
	{
		int temp=num;
		int min1=Integer.MAX_VALUE;
		while(temp!=0)
		{
			int last=temp%10;
			if(last <min1)
			{
				min1=last;
			}
			temp/=10;
		}
		return min1;
	}
}
