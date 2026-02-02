
import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Price (P) : ");
    float price = input.nextFloat();

    System.out.print("Enter Rate (R) : ");
    float rate = input.nextFloat();

    System.out.print("Enter Time (T) : ");
    float time = input.nextFloat();

    float simpleInterest = (price * rate * time) / 100;

    System.out.print("Simple Interst = " + simpleInterest);

  }
}
