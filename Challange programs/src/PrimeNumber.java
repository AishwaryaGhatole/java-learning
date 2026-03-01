import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    boolean isPrime = isPrime(num);

    if(isPrime){
      System.out.print("The Given Number " + num + " is Prime.");
    }else {
      System.out.print("The Given Number " + num + " is non Prime.");
    }

  }
  public static boolean isPrime(int num){
    for(int i = 2; i < num; i++){
      if(num % i == 0 ){
        return false;
      }
    }
    return true;
  }
}
