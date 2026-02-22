import java.util.*;
// this is a code that divides the number into parts and gives the output of sum of each digit in that integer
public class DigitSum {
  public static void main(String[] args) {
      int number = getNumber();
      digitSumFromInteger(number);
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Give your Number : ");
    return input.nextInt();
  }

  public static int digitSumFromInteger(int num){
    int digit;
    int sum = 0;

    while(num > 0){
      digit = num % 10;
      num = num / 10;
      sum = sum + digit;
      System.out.println("Sum is " + sum);
    }
    System.out.println(sum);
    return num;
  }
}
