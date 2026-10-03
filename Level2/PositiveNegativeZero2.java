import java.util.Scanner;
public class PositiveNegativeZero2 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number: ");  
        int n = s.nextInt();
       int sign = Integer.signum(n);
        System.out.println("SIGN of Number:"+ sign);     
    if (sign == 1) {
            System.out.println(n + " is Positive");
        } else if (sign == -1) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
  
      s.close();
        }
     }