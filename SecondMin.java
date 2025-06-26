//This Program gives us Second minimum number of given number.
import java.util.Scanner;
class SecondMin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num=sc.nextInt();
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int temp =num;
		while(temp!=0)
		{
			int last=temp%10;
			if(last<min1)
			{
				min2=min1;
				min1=last;
			}
			else if(last<min2 && min1!=min2)
			{
				min2=last;
			}
			temp/=10;
		}	
		System.out.println(min2);
	}
}
