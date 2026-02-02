
import java.util.Scanner;

public class Relational {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Please Enter your Age : ");
    int age = input.nextInt();

    if(age >= 18){
      System.out.print("Please Enter your Plan validation for adults");
    } else {
      System.out.print("Sorry! No services Valid for Minors.");
    }
  }
  
}
