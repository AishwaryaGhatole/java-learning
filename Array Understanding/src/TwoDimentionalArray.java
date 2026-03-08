public class TwoDimentionalArray {
  public static void main(String[] args) {
    int[][] threeDArr =  {{1,2,3}, {4,5,6}, {7,8,9}};

    
    // Array Traversal
    int i = 0;
    while(i < threeDArr.length){
      int j = 0;
      while(j < threeDArr[i].length){
        System.out.print(threeDArr[i][j] + " ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
