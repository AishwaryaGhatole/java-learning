
import java.util.Scanner;

public class Return {
  public static void main(String[] args) {

    int num1 = readNumber();
    int num2 = readNumber();

    addition(num1, num2);
  }

  public static int readNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("enter your number: ");
    return input.nextInt();
  }

  public static int addition(int first, int second){
    int sum = first + second;
    System.out.println("The sum is : " + sum);
    return sum;
  }
}
