import java.util.Scanner;
class AutomorphicNumber
{
        public static void main(String[] args) 
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int temp=num;
                int count =(int)Math.log10(num)+1;
                //System.out.println(count);
                int square=num*num;
                boolean flag=true;
                while(temp>0)
                {
                        if(temp%10 != square%10)
                        {
                                flag=false;
                                break;
                        }
                        temp/=10;
                        square/=10;
                        
                }
                if(flag)
                        System.out.println("its Automorphic Number");
                else 
                        System.out.println("Not a automorphic ");

        }
}
