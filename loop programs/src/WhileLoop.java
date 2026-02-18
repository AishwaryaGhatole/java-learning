
import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args){
  // int num = 1;
  // while (num <= 10) { 
  //     System.out.println(num);
  //     num++;
  // }
  // int num = 500;
  // while(num >= 200){
  //   System.out.println(num);
  //   num--;
  // }

  Scanner input = new Scanner(System.in);

  int i = 1;

  while(i <= 5){
    System.out.println("Give your Lucky Number !! ");
    int inp = input.nextInt();
    System.out.println("your number input : " + inp);
    i++;
  }
}
}
