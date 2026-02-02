import java.util.Scanner;

public class CompoundInterest {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Price (P) : ");
    float price = input.nextFloat();

    System.out.print("Enter Rate (R) : ");
    float rate = input.nextFloat();

    System.out.print("Enter Time (T) : ");
    float time = input.nextFloat();

    float base = 1 + rate/100;

    double compoundInterest = (int) (price * Math.pow(base, time));

    System.out.print("Compound Interest = " + compoundInterest);

  }
}
