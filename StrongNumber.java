import java.util.Scanner;
class StrongNumber
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int sum=0;
                int temp =num;
                while(temp!=0)
                {
                        int fact=1;
                        int last =temp%10;
                        for(int i=1 ; i<=last;i++)
                        {
                                fact*=i;
                        }
                        sum+=fact;
                        temp/=10;
                }
                if(num==sum)
                        System.out.println("Strong Number");
                else 
                        System.out.println("Not Strong Number");

        }
}
