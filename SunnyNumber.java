//This Program gives us Given Number is Sunny number or Not
import java.util.Scanner;
class Sunny
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num+1;
		int prod=1;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			prod=i*i;
			if(prod==temp)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println(num+" : Is a sunny number");
		else 
			System.out.println(num+" : Is not a Sunny Number");
	}
}
