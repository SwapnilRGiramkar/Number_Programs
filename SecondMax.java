//finding the Second maximum number
import java.util.Scanner;
class SecondMax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int temp=num;
		while(temp!=0)
		{
			int last=temp%10;
			if(last>max1 )
			{
				max2=max1;
				max1=last;
			}
			else if(last>max2 && max2!=max1)
			{
				max2=last;
			}
			temp/=10;
		}
		System.out.println("Second MAximum Number is : "+max2);
	}
}
