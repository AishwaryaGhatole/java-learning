
import java.util.Scanner;

public class ReverseDigit {
  public static void main(String[] args) {
    int num = getNumber();
    numberReverser(num);
      
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    return input.nextInt();
  }
  //12345
  public static int numberReverser(int num){
    int i = 0;
    int reversedDigit = 0;
    while(num != 0){
      int digit = num % 10;
      num = num / 10;
      reversedDigit = reversedDigit * 10 + digit;
      i++;
    }
    System.out.print("First output : " + reversedDigit);
    return 0;
  }
}
