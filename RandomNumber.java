import java.util.Scanner;
import java.util.Random;

class RandomNumber
{
   public static void main(String[] args)
   {
       int Max;
       Scanner sc=new Scanner(System.in);
       Random rand=new Random();
       System.out.println("Enter Maximum range :");
       Max=sc.nextInt();
       System.out.println("Random Number is :");
       System.out.println(rand.nextInt(Max));
    
    }
 }




