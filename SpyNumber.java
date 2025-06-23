import java.util.Scanner;
class Prime
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int sum=0;
                int temp =num;
                int prod=1;
                while(num!=0)
                {
                        int last=num%10;
                        sum+=last;
                        prod*=last;
                        num/=10;
                }
                if(sum==prod)
                        System.out.println("Its Spy Number");
                else 
                        System.out.println("Not Spy Number");

        }
}
