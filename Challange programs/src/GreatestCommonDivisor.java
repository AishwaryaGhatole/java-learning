
import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String [] args){
    int num1 = getNumber();
    int num2 = getNumber();
    getGCD(num1, num2);

    
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    return input.nextInt();
  }

  public static int getGCD (int num1, int num2){
    int gcd = 1;
    int least = leastNumber(num1, num2);
    System.out.println("Small number is " + least);
    for (int i = 2; i <= least; i++){
      if(num1 % i == 0 && num2 % i == 0){
        gcd = i;
        System.out.print("Your GCD is " + i);
        return gcd;
      }
    }
    System.out.print("Your Gcd is 1.");
    return gcd;
  }

  public static int leastNumber (int num1, int num2){
    if(num1 < num2){
      return num1;
    }else{
      return num2;
    }
  }
}

















