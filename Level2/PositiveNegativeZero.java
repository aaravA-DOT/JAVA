import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number: ");  
        int n = s.nextInt();
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}