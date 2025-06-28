//This Program gives us Frequncy or Count of digit 
import java.util.Scanner;
class FrequencyDigit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		for(int i=0;i<=9;i++)
		{
			int temp=num;
			int count=0;
			while(temp>0)
			{
				int last=temp%10;
				if(last==i)
				{
					count++;
				}
				temp/=10;
			}
			if(count>0)
			{
				System.out.println("Digit " + i + " occurs " + count + " times.");
			}

		}

	}
}
