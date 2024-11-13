public class Algorithms {

  private static void fillTheMatrix(int[][] matrix, int n){
    int numberToPutInBeginning = 1;
    int numberToPutInEnd = n*(n-1);

    for(int j = 0; j < matrix.length;j++) {
      for (int i = 0; i < matrix.length; i++){
        if (i<j){
          matrix[i][j] = numberToPutInEnd--;
        }
        if (i > j){
          matrix[i][j] = numberToPutInBeginning++;
        }
        if (i==j){
          matrix[i][j] = 0;
        }
      }
    }
  }

  public static void fillSpiral(int[][] matrix) {
    int left = 0;
    int right = matrix[0].length - 1;
    int top = 0;
    int bottom = matrix.length - 1;
    int value = 1;

    while (left <= right && top <= bottom) {

      for (int i = top; i <= bottom; i++) {
        matrix[i][left] = value++;
      }
      left++;

      for (int i = left; i <= right; i++) {
        matrix[bottom][i] = value++;
      }
      bottom--;

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          matrix[i][right] = value++;
        }
        right--;
      }

      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          matrix[top][i] = value++;
        }
        top++;
      }
    }
  }

  private static void eratosten(int n){
    int j;
    int i = 2;
    int [] masiv = new int[30000];
    while(i <= n){
      if(masiv[i] == 0){
        System.out.println(i);
        j = i*i;
        while (j <= n){
          masiv[j] = 1;
          j += i;
        }
      }
      i++;
    }
  }

  private static void primeNumbersDivision(int n){

    int i ,how,j;
    System.out.print(n + " = ");
    i = 1;
    while(n != 1) {
      i++;
      how = 0;
      while(0 == n % i) {
        how++;
        n = n / i;
      }
      for (j = 0; j<how; j++){
        System.out.print(i + " ");
      }
    }
    System.out.println("\n");
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println(); // Move to the next line after each row
    }
  }

}
