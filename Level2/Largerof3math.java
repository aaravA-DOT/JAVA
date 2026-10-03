import java.util.Scanner;
public class Largerof3math {
public static void main(String[] args){
     System.out.println("Enter Your Numbers:");
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     int num2 = s.nextInt();
     int num3 = s.nextInt();
     //logic
 int largest = Math.max(num, Math.max(num2, num3));
    System.out.println("Largest Number:"+ largest);

s.close();
}}