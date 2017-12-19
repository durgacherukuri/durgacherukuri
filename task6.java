package task6;
import java.util.Scanner;
public class task6
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number");
    
    int n=s.nextInt();
    
        for(int i=1;i<=n;i++)
        {
            else if(i%3==0)
            System.out.println("Fizz\n");
            if(i%5==0)
            System.out.println("Buzz\n");
            else if((i%3==0)&&(i%5==0))
            System.out.println("FizzBuzz");
            else System.out.println(i);
        }
    }
}
