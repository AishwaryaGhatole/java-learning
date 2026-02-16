
import java.util.Scanner;

public class Bitwise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This Program Checks the Bitwise Operations : ");
    
    System.out.print("Please enter your first number : ");
    int int1 = input.nextInt();
    System.out.print("Please enter your second number : ");
    int int2 = input.nextInt();
    
    int result1 = int1 & int2;
    System.out.println("~~~Showcasing Bitwise AND Operator~~~ " + result1);
    
    int result2 = int1 | int2;
    System.out.println("~~~Showcasing Bitwise OR Operator~~~ " + result2);
    
    
    int result3 = int1 ^ int2;
    System.out.println("~~~Showcasing Bitwise XOR Operator~~~ " + result3);
    
    int result4 = ~int1;
    System.out.println("~~~Showcasing Bitwise compliment Operator~~~ " + result4);
    
    int result5 = int1 >> 1;
    System.out.println("~~~Showcasing Bitwise RIGHT SHIFT Operator~~~ " + result5);

    int result6 = int1 << 1;
    System.out.println("~~~Showcasing Bitwise LEFT SHIFT Operator~~~ " + result6);

  }
}
