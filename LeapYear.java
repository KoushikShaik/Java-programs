import java.util.*;
public class LeapYear {
 
        public static void main(String[] args) {
            int year;   
        	//year we want to check
               
               System.out.println("Enter a Year :");
               Scanner sc=new Scanner(System.in);
               year=sc.nextInt();
               
               if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            	   System.out.println( "Year" +year+" is a leap year");
                else
                        System.out.println("Year"+year+" is not a leap year");
        }
}