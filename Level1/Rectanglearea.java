import java.util.Scanner;
 public class Rectanglearea {
  public static void main(String[] args){
     System.out.println("Enter the Length N Breadth: ");
     Scanner s = new Scanner(System.in);
     int l = s.nextInt();
     int b = s.nextInt();
     int Area = l*b;
     int Perimeter = 2 * (l+b);
     System.out.println("Area of Rectangle:" + Area);
     System.out.println("Perimeter of Rectangle:" + Perimeter);
  s.close();

   }
} 