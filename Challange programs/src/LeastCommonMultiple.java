import java.util.*;

public class LeastCommonMultiple {
  public static void main(String[] args) {
    int number1 = getNumber();
    int number2 = getNumber();
    lcmCalculator(number1, number2);
      
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    return input.nextInt();
  }
  public static int lcmCalculator(int num1, int num2){
    int i = 1;
    int factor;
    while(i <= num2){
      factor = num1 * i;
      if (factor % num2 == 0) {
          System.out.println("this is the LCM : " + factor );
          return factor;
      }
      i++;
    }
    return 0;
  }
}
