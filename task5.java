package task5;
import java.util.Scanner;
 
public class task5 {
  public static void main(String args[]) {
   
    Scanner in = new Scanner(System.in);      
    double temperatue;
    System.out.println("Enter temperatue in Fahrenheit");
    temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperatue in Celsius = " + temperatue);
  }
}