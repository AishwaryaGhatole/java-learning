
import java.util.Scanner;

public class ArithematicOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        double a = input.nextDouble();

        System.out.print("Enter the Second Number : ");
        double b = input.nextDouble();

        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double mod = a % b;

        System.out.println("Multiplication is :" + add);
        System.out.println("\nSubstraction is :" + sub);
        System.out.println("\nMultiplication is :" + mul);
        System.out.println("\nDivision is :" + div);
        System.out.println("\nModulus is :" + mod);
    }
}
