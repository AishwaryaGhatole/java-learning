import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args) {
    int num = getNumber();
    getFibonacci(num);
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    return input.nextInt();
  }
  public static int getFibonacci(int num){
    int num1 = 0, num2 = 1, num3;
    if(num < 0){return 0;}
    System.out.print("0 ");
    if (num == 0){return 0;}
    System.out.print("1 ");

    for(int i = 0; (num1 + num2) < num; i++){
      num3 = num1 + num2;
      System.out.print(num3 + " ");
      num1 = num2;
      num2 = num3;
      
      i++;
    }
    return 0;
  }
}