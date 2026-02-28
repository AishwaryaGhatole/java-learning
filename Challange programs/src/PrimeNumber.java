
import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    int num = input.nextInt();

    if(num == 2 || (num % 2) != 0){
      System.out.print("The Given Number " + num + " is Prime.");
    }else{
      System.out.print("The Given Number " + num + " is not Prime.");
    }
  }
}
