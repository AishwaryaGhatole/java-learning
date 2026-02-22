
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = getNumber();
        multiplicationTable(number);
        
    }
    public static int multiplicationTable(int num){
        int mul;
        for(int i = 1; i <= 10; i++){
            mul = num * i;
            System.out.print(num + " x " + i + " = " + mul + " | ");
        }
        return num;
    }
    public static int getNumber (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        return input.nextInt();
    }
}
