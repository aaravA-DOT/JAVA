import java.util.Scanner;

public class SI {
 public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Principal amount:");
double P = s.nextDouble();
      System.out.println("Enter the Rate:");
double R = s.nextDouble();
      System.out.println("Enter the Time in years:");
double T = s.nextDouble();
   double SI = (P*R*T)/100;
   double Total = P + SI;
        System.out.println("Simple Interest:"+ SI);
        System.out.println("Total Due amount:"+ Total);

  s.close();

  }
}