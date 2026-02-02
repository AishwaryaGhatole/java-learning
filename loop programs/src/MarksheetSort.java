
import java.util.Scanner;

public class MarksheetSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Markwise Grading ");

    System.out.print("Enter your Marks % : ");
    float percentage = input.nextFloat();

    if(percentage > 90){
      System.out.println("You achieved A grade !");
    }else if (percentage >75){
      System.out.println("You achieved B grade !");
    }else if(percentage > 60){
      System.out.println("You achieved C grade !");
    }else if(percentage > 30){
      System.out.println("You achieved D grade !");
    }else{
      System.out.println("You achieved F grade !");
    }
  }
}
