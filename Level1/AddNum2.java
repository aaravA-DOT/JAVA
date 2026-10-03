import java.util.Scanner;

public class AddNum2 { 
   public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();  
        int b = sc.nextInt();
        System.out.println("sum:" + (a+b) );
        sc.close(); 
   }
}



