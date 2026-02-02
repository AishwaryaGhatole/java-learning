
import java.util.Scanner;

public class PatternUsingEscapeSequence {
  public static void main(String[] args){
    System.out.println("*\n* *\n* * *\n* * * *\n* * * * *\n");
    System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *\n");
    System.out.println("* * * * *\n* * * *\n* * *\n* *\n*\n");
    
    Scanner input = new Scanner(System.in);
    System.out.print("hello please enter your name :");
    String name = input.nextLine();
    System.out.println("hello there! " + name);
  }
  
}
