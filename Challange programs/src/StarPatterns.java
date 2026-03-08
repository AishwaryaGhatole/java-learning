import java.util.Scanner;

public class StarPatterns {
  public static void main(String[] args) {
    int num = getNumber();
    starPattern1(num);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    starPattern2(num);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    starPattern3(num);
  }
  public static int getNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please Give a Number : ");
    return input.nextInt();
  }
  public static void starPattern1(int num){
    int rows = 0;
    while (rows < num){             //0<5
      System.out.print("*");     // *
      int i = 0; 
      while(i < rows){              // 0<0
        System.err.print(" *"); // null
        i++;                         // 1
      }
      System.out.println();
      rows++;
    }
  }

  public static void starPattern2(int num){
    int rows = num;
    while(0 < rows){
      System.out.print("*");
      int i = 1;
      while(i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows--;

    }
  }
  public static void starPattern3(int num){
    int rows = num;
    while(rows > 0){
      //this loop is for voidspaces
      int j = 0;
      while(j < (rows - 1)){
        System.out.print("  ");
        j++;
      }

      //this loop is for the stars printing
      int i = 0;
      while(i<= (num - rows)){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows--;

    }
  }
}
