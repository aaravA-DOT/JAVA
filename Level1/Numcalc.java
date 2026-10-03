import java.util.Scanner;

  public class Numcalc {
     public static void main(String[] args){
       
         Scanner S = new Scanner(System.in);
         System.out.println("Enter the two numbers:");
         int a = S.nextInt();
         int b = S.nextInt();
         System.out.println("Addition:" + (a+b));
         System.out.println("Substraction:" + (a-b));
         System.out.println("Multiplication:" + (a*b));
         System.out.println("Division:" +(a/b));
         System.out.println("Remainder:" + (a%b));
         System.out.println("Exact Division:" + ((double) a / b) );
        S.close();
  }
}