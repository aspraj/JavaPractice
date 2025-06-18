package practice;

public class MultiplyMatrix {
  public static void main(String[] args) {
    int[][] first = {{1, 2}, {3, 4}};
    int[][] second = {{5, 6}, {7, 8}};
    int[][] multiply;

    multiply = multiplyMatrix(first, second);

    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < second.length; j++) {
        System.out.print(multiply[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int[][] multiplyMatrix(int[][] first, int[][] second){
    int[][] multiply = new int[first.length][second.length];
    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < second.length; j++) {
        for (int k = 1; k >= 0; k--) {
          multiply[i][j] = first[i][j] * second[j][i] + first[i][k] * second[k][k];
        }
      }

    }
    return multiply;
  }
}
