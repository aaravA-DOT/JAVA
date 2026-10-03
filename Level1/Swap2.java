import java.util.Scanner;

public class Swap2 {
 public static void main(String[] args){
      
     System.out.println("Enter the Numbers:");
     Scanner S = new Scanner(System.in);
       int a = S.nextInt();
       int b = S.nextInt();
      System.out.println("Numbers before swap:" + a + "\t" + b);
         a = a + b;
         b = a - b;
         a = a - b;
     System.out.println("Numbers after swap:" + a + "\t" + b);
     S.close();
 
 }
}