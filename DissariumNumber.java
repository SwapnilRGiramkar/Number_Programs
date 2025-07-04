//Dissarium Number Program 
import java.util.Scanner;
class Dissarium
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = (int)Math.log10(num)+1;
		System.out.println(count);
		int temp=num;
		int sum=0;

		while(temp!=0)
		{
			int last=temp%10;
			sum+=Math.pow(last,count);
			
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
