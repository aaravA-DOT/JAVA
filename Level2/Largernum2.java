import java.util.Scanner;
public class Largernum2 {
public static void main(String[] args){
     System.out.println("Enter Your Numbers:");
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     int num2 = s.nextInt();
     //logic
 int max = Math.max(num, num2);   
             System.out.println("larger: " + max);

s.close();
}}