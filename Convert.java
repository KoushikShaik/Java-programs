 import java.util.Scanner;

public class Convert {
    public static void main(String [] args) 
    { 
     Scanner scan = new Scanner(System.in);  

System.out.print("Enter Fahrenheit to Convert into Celsius:"); 
double temps = scan.nextDouble(); 
 
// convert F to C 
temps =(temps-32)*5/9.0; 
System.out.println("Celsius Degrees is"+temps+"'C");
// convert C to F 
System.out.print("Enter Celsius to Convert into Fahrenheit:"); 

temps = (temps * 9/5.0) +32; 

System.out.println("Fahrenheit Degrees is"+temps+"'F");
}//end main() 
}//end class