
import java.util.Scanner;

public class FloatProduct {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your First Number : ");
    float float1 = input.nextFloat();

    System.out.print("Enter your Second Number :");
    float float2 = input.nextFloat();

    float floatProduct = float1 * float2 ;

    System.out.println("The Product is : " + floatProduct);

  }
}
