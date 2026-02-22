import java.util.*;

public class Factorial {
  public static void main(String[] args) {
    int number = getNumber();
    factorialCalculator(number);
      
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Input a Number : ");
    return input.nextInt();
  }
  public static int factorialCalculator(int num){
    int factorial = 1;
    int initialValue = 1;

    while(initialValue <= num){
      factorial = factorial * initialValue;
      System.out.print(initialValue);
      
      //does not prints x after the last number
      if(initialValue < num ) {
        System.out.print(" x ");
      }
      initialValue++;
    }
    System.out.println(" = " + factorial);
    System.out.println("Your factorial of " + num + "!" + " is " + factorial + ".");

    return factorial;
  }
}