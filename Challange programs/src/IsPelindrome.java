import java.util.Scanner;

public class IsPelindrome {
  public static void main(String [] args){
    int num = getNumber();
    boolean isPelindrome = pelindromeChecker(num);
    
    if(isPelindrome){
      System.out.println("Your Given Number is Pelindrome !!");
    }else{
      System.out.println("Your Given Number is not a Pelindrome !!");
    }

  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    return input.nextInt();
  }
  public static boolean pelindromeChecker(int num){
    int i = 0;
    int numCopy = num;
    int digit = 0;
    while(0 < numCopy){                   // 0 < 123 || 0 < 12 || 0 < 1
      int container = numCopy % 10;           // digit = 3 || digit = 2 || digit = 1
      numCopy = numCopy / 10;                     // 123/10 = 12 || 12/10 = 1 || 1/10 = 0
      digit = digit * 10 + container;     //3 || 30+2 = 32 || 320 + 1 = 321;
      i++;
    }
    System.out.println("Your Reversed Number is " + digit);
    return num == digit;
  }
}
