
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array checker !!");
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        numChecker(num);


    }

    public static int numChecker(int num){
        int[] numArr = {8,4,9,3,4,2};
        int i = 0;
        while (i < numArr.length){
            System.out.println("Your Number is : " + numArr[i]);

            if(numArr[i] == num){
                System.out.println("The given number " + numArr[i] + " Exists in the Array!" );
            }
            i++;
        }
        return num;
    }
}
