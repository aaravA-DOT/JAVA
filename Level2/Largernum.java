import java.util.Scanner;
public class Largernum {
public static void main(String[] args){
     System.out.println("Enter Your Numbers:");
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     int num2 = s.nextInt();
     //logic
    if (num > num2){
             System.out.println(" First Number is larger: " + num +" > \t"+ num2);
}else {
         System.out.println(" second Number is larger: "+ num2 +" > \t"+ num);
}
s.close();
}}