import java.util.Scanner;

public class Swap {
 public static void main(String[] args){
      
     System.out.println("Enter the Numbers:");
     Scanner S = new Scanner(System.in);
       int a = S.nextInt();
       int b = S.nextInt();
      System.out.println("Numbers before swap:" + a + "\t" + b);
         int temp;
         temp = a;
         a = b; 
         b = temp;
     System.out.println("Numbers after swap:" + a + "\t" + b);
     S.close();
 
 }
}