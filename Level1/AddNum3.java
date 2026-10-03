import java.util.Scanner;

  public class AddNum3 {
     public static void main(String[] args){
       
         Scanner S = new Scanner(System.in);
         System.out.println("Enter the two numbers:");
         float a = S.nextFloat();
         float b = S.nextFloat();
         System.out.println("Sum:" + (a+b));
         S.close();


   }

}