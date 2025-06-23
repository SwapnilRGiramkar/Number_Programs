import java.util.Scanner;
class HarshadNumber
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int sum=0;
                while(num!=0)
                {
                        int last=num%10;
                        sum+=last;
                        num/=10;
                }
                if(num%sum==0)
                        System.out.println("Harshad Number ");
                else 
                        System.out.println("Not Harshad Number ");
                
        }
}
