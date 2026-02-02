
import java.util.Scanner;

public class TriangleArea {
  public static void main (String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter Height of the Triangle = " );
      float triangleHeight = input.nextFloat();

      System.out.print("Enter Height of the Breadth = " );
      float triangleBreadth = input.nextFloat();
      input.close();

      float triangleArea = (float) 0.5 * (triangleHeight * triangleBreadth);

      System.out.print("Area of the Triangle = " + triangleArea);

  }
}
