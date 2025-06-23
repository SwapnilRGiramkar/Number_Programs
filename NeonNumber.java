import java.util.Scanner;
class NeonNumber
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int sum=0;
                int square=num*num;
                while(square!=0)
                {
                        int last=square%10;
                        sum+=last;
                        square/=10;
                }
                if(num==sum)
                        System.out.println("Its Neon Number");
                else 
                        System.out.println("Not Neon Number");

        }
}
