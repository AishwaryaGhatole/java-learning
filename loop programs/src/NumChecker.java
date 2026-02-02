
import java.util.Scanner;

public class NumChecker {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Number Checker !");
        System.out.print("Enter your Number here : ");
        double number = input.nextDouble();

        if(number < 0){
            System.out.println("The given Number is Negative !");
        } else if (number == 0 ){
            System.out.println("The given Number is zero !");
        }else {
            System.out.println("The given Number is Positive !");
        }
    }
}
