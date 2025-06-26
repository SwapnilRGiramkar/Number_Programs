//This programs using method gives us Second maximum and Second Minimum
 import java.util.Scanner;
 class SecondMaxOrMin
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the number : ");
 		int num=sc.nextInt();
 		
 		System.out.println("Second Max Number : "+SecondMax(num));
 		System.out.println("Second Min Number : "+SecondMin(num));
 	}
 	public static int SecondMax(int num)
 	{
 		int max1=Integer.MIN_VALUE;
 		int max2=Integer.MIN_VALUE;
 		int temp=num;
 		while(temp!=0)
 		{
 			int last=temp%10;
 			if(last>max1)
 			{
 				max2=max1;
 				max1=last;
 			}
 			else if(last>max2 && max1!=max2)
 			{
 				max2=last;
 			}
 			temp/=10;
 		}
 		return max2;
 	}
 	public static int SecondMin(int num)
 	{
 		int temp=num;
 		int min1=Integer.MAX_VALUE;
 		int min2=Integer.MAX_VALUE;
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
 		return min2;
 	}
 }
