import java.util.Scanner;

public class Temperature {
 public static void main(String[] args){
    
   System.out.println("Enter the Temperature in Celsius:");
   Scanner s = new Scanner(System.in);
   double C = s.nextDouble();
   double F = (C * 9 / 5) + 32;
   System.out.println("Celsius: " + C + "Fahrenheit:" + F);
   s.close();

  }
}