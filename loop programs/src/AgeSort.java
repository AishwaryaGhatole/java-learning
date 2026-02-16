
import java.util.Scanner;

public class AgeSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Age Sorting !");

    System.out.print("Enter Your Age : ");
    int age = input.nextInt();

    if(age <= 13){
      System.out.println("You're a Child");
    }else if (age <= 20){
      System.out.println("You're a Teen");
    }else if(age <= 60){
      System.out.println("You're an Adult");
    }else{
      System.out.println("You're a Senior");
    }
  }
}
