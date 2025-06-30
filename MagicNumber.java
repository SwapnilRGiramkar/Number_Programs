//This Program gives us Magic Number
import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		//int temp=num;
		while(num>9)
		{
			int sum=0;
			while(num>0)
			{
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		if(num==1)
			System.out.println("Magic Number");
		else 
			System.out.println("not a magic number ");
	}
}

