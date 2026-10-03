import java.util.Scanner;

public class Cinterest {
 public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Principal amount:");
double P = s.nextDouble();
      System.out.println("Enter the Rate:");
double R = s.nextDouble();
      System.out.println("Enter the Time in years:");
double T = s.nextDouble();

double amount = P * Math.pow(1 + R / 100, T);
double CI = amount - P;

      System.out.printf("Amount:%.2f%n",amount);
      System.out.printf("CI amount:%.2f%n",CI);
s.close();
  }
}