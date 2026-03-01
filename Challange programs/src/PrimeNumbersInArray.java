
import java.util.Arrays;
import java.util.Scanner;


public class PrimeNumbersInArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.next();
    String[] parts = line.split("");
    int[] arr = new int[parts.length];
    
    for(int i = 0; i < parts.length; i++){
      arr[i] = Integer.parseInt(parts[i]);
      if(arr[i] % 2 != 0){
        System.out.print("[Prime], ");
      }else{
        System.out.print("[non-Prime], ");
      }
    } 
    System.out.println();
    System.out.print(Arrays.toString(arr));
  }
}
