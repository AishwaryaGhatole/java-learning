
import java.util.Scanner;

public class GreatestNumber{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter First Number :");
      int num1 = input.nextInt();

      System.out.print("Enter Second Number :");
      int num2 = input.nextInt();

      System.out.print("Enter Third Number :");
      int num3 = input.nextInt();

      if(num1 > num2 && num1 > num3){
        System.out.println("First Number is the Biggest !");
      } else if (num2 > num1 && num2 > num3){
        System.out.println("Second Number is the Biggest !");
      }else{
        System.out.println("Third Number is the Biggest !");
      }

  }
}