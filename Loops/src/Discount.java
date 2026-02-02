
import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   System.out.println("Welcome to discount Calculator !");   
   System.out.print("Please enter your Age : ");
   int age = input.nextInt();

   System.out.print("Are you a Female ? (true/false) :");
   boolean female = input.nextBoolean();

   if (age < 5 ) {
       System.out.println("You're Eligible for 75% Discount !");
   } else if(female){
       System.out.println("You're Eligible for 50% Discount !");
      } else if(age >= 60 && !female){
     System.out.println("You're Eligible for 25% Discount !");
    } else{
     System.out.println("You're not Eligible for any Discount.");

   }
   
  }
}
