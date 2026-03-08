
import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
   int num = getNumber();
   boolean isArmstrong = isArmstrong(num); 
   int totalDigits = noOfDigit(num);
   powerCalculator(num, totalDigits);
   isArmstrong(num);

   
   if(isArmstrong){
    System.out.println("The given Number is an Armstrong Number.");
  }else{
     System.out.println("The given Number is not an Armstrong Number.");
   }
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Number : ");
    return input.nextInt();
  }

  public static boolean isArmstrong(int num){ //153
    int givenNumber = num;
    int totalDigit = noOfDigit(givenNumber); //3 
    int finalNumber = 0;
    while(num > 0){  
      //153>0=true || 15>0=true || 1 ||
      int digit = num % 10; 
      //153%10=3 || 15%10=5 1%10=1
      num=num / 10; 
      //153/10=15 || 15/10 = 1 || 1/10=0
      finalNumber = finalNumber + powerCalculator(digit, totalDigit); 
      //0+powerCalculator(3,3)=27 || 27+powerCalculator(5,3) 
      //1+(1*3*3*3) || 1+(1*3*3*3)+(1*5*5*5) || 1+(1*3*3*3)+(1*5*5*5)+(1*1*1*1)
    }
    System.out.println("Sum of all the numbers is "+finalNumber);

    return finalNumber == givenNumber;
  }


  public static int powerCalculator(int num1, int num2){ //int 2, int 3
    int result = 1; // 1
    int i = 0;
    while(num2 > i){  //3>0=true || 3>1=true || 3>2=true || 3>3=false (End, Return result = 1*2*2*2)
      result = result * num1; 
      // 1*2 || 1*2*2 || 1*2*2*2
      i++; 
      //1 || 2 || 3
    }
    System.out.println("the value of "+num1+", "+num2+" Times is " + result);
    return result;
  }

  public static int noOfDigit(int num){  // int 153
    int digit = 0;
    while(num > 0){ //153 > 0=true || 15>0=true || 1>0=true || 0>0=false (End, hence return digit=3)
      num = num / 10; 
      //153 = 150/10=15 || 15/10=1 || 1/10=0
      digit ++; 
      // 1 || 2 || 3
    }
    System.out.println(digit);
    return digit;
  }
}
