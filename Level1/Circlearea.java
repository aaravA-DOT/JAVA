import java.util.Scanner;
public class Circlearea {
 public static void main(String[] args){ 

           System.out.println("Enter the radius of the circle: ");
      Scanner s = new Scanner(System.in);
      double r = s.nextInt();
     // double Area = Math.PI * r * r; 
      double Area = Math.PI * Math.pow(r, 2);
           System.out.println("Area of the circle: " + Area +"cm2");
           System.out.printf("Area of the circle:%.2f%n ", Area);

      s.close();

   }
}