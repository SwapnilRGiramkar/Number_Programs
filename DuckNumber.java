//This program gives Duck no or not.
//if number has contain 0 its duck and number contain start with 0 is not duck and number not contain 0 its not duck 
import java.util.Scanner;
class Duck
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		boolean flag=false;
		if(num!=0)
		{
			while(num!=0)
			{
				int last= num%10;
				if(last==0)
				{
					flag=true;
					break;
				}
				else 
				{
					num/=10;
				}
			}
			if(flag)
			{
				System.out.println("Its Duck Number");
			}
			else 
				System.out.println("Not a Duck Number");
		}
		else 
		{
			System.out.println("Not Duck Number ");
		}
	}
}
