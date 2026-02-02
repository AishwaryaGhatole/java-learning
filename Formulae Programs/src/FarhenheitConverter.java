
import java.util.Scanner;

public class FarhenheitConverter{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter Degree Farhenheit :");
      float farhenheit = input.nextFloat();

      Float celcius = (farhenheit -32) * 5/9;

      System.out.print("In Degree Celcius : " + celcius);   
  }
}