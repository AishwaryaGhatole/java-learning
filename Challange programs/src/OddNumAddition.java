
import java.util.Scanner;

public class OddNumAddition {
  public static void main(String[] args) {
      System.out.println("~~~ Welcome to Addtion of All Odd Numbers ~~~");
      int number = getNumber();
      oddNumAdding(number);

  }

  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    return input.nextInt();
  }
  public static int oddNumAdding(int num){
    int sum = 0;
    int i = 1;
    while (i <= num){
      sum = sum + i;
      i = i + 2;
    }
    System.out.println("your sum is : " + sum);
    return sum;
  }
}
