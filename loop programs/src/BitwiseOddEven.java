import java.util.Scanner;

public class BitwiseOddEven {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = input.nextInt();

    if((num & 1) == 1){
      System.out.println("This number is an odd number.");
    } else{
      System.out.println("This number is an even number.");
    }
  }
}
