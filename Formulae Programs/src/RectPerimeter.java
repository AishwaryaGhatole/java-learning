
import java.util.Scanner;

public class RectPerimeter {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter Horizontal side : ");
   float horizontalSide = input.nextFloat();

   System.out.print("Enter Vertical side : ");
   float verticalSide = input.nextFloat();

   float rectPerimeter = 2 *(horizontalSide + verticalSide);

   System.out.print("Perimeter of the Rectangle = " + rectPerimeter);
  }
  
}
