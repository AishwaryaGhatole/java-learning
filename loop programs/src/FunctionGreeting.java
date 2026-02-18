public class FunctionGreeting {
    public static void main(String[] args) {
      triangle1(5);
      System.out.println("this is the end of first triangle");
      triangle2(5);
    }


    public static void greetingUser(){
      System.out.println("Hello user! its a code outside the main method!");
    }

    public static void triangle1(int row){
      while (row > 0){
        System.out.print("*");

        int stars = 5;
        while (stars > row ) { 
          System.out.print(" *");
          stars--;
        }

        System.out.println();
        row--;
      }
    }

    public static void triangle2(int row){
      while (row > 0){
        System.out.print("*");
        int stars = 1;
        while (stars < row ) { 
          System.out.print(" *");
          stars++;
        }
        System.out.println();
        row--;
      }
    }
  }

