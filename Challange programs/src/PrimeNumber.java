
import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    int num = input.nextInt();
    boolean isPrime = primeNumberChecker(num);
    if(isPrime){
      System.out.println("Given number is Prime");
    }else{
      System.out.println("Given number is not Prime");
    }

  }
  public static boolean primeNumberChecker(int num){
    for(int i = 2; i <= num; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}
