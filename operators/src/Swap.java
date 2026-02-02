
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Swapping station :");

        System.out.print("Enter your first number : ");
        long num1 = input.nextLong();

        System.out.print("enter your second number : ");
        long num2 = input.nextLong();

        long numContainer = num1;

        num1 = num2;
        num2 = numContainer;


        System.out.print("your swapped numbers are : " + "num1 =" + num2 + ", num2 =" + num1);

    }
}
