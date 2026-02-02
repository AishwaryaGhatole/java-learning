
import java.util.Scanner;

public class AddingNumber {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Tell us your name here : ");
    String name = input.nextLine();
    System.out.println("welcome " + name + " to aishwarya's mercy");
    
    
    System.out.print("enter your first number: ");
    long num1 = input.nextLong();
    
    System.out.print("enter your second number: ");
    long num2 = input.nextLong();
    
    long sum = num1 + num2;
    
    System.out.println("This is your addition of two numbers given by you : " + sum);

    input.nextLine();
    
    System.out.println("whats your name ?");
    String name1 = input.nextLine();
    System.out.println("hello there ! ," + name1);
  }
  
}
