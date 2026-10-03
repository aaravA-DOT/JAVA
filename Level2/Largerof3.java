import java.util.Scanner;
public class Largerof3 {
public static void main(String[] args){
     System.out.println("Enter Your Numbers:");
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     int num2 = s.nextInt();
     int num3 = s.nextInt();
     //logic
    if (num > num2 && num > num3){
             System.out.println(" First Number is largest: " + num);
} else if (num2>num3) {
         System.out.println(" second Number is largest: "+ num2);
} else {
         System.out.println("Third Number is largest: "+ num3);
}
s.close();
}}