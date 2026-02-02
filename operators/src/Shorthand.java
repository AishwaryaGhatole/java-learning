
import java.util.Scanner;

public class Shorthand {
  public static void main( String[] args){
    Scanner input = new Scanner(System.in);
     int a = 5;

     int x1 = input.nextInt();
     a+=x1;

     int x2 = input.nextInt(a);
     a+=x2;

     int x3 = input.nextInt(a);
     a+=x3;

     int x4 = input.nextInt(a);
     a+=x4;

     int x5 = input.nextInt(a);
     a+=x5;

    System.out.println("your new value of a is : " + a);
  }
}
