//Dissarium Number Using Loop
import java.util.Scanner;
class Dissarium
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp=num;
		int sum=0;

		while(temp!=0)
		{
			int count = (int)Math.log10(temp)+1;
			int last=temp%10;
			int sq=1;
			//sum+=Math.pow(last,count);
			for(int i=1;i <= count ;i++)
			{
				sq*=last;
			}
			sum+=sq;
			count--;
			temp/=10;
		}
		System.out.println(sum);
		if(num==sum)
			System.out.println("Dissarium ");
		else 
			System.out.println("Not Dissarium");
	}
}
