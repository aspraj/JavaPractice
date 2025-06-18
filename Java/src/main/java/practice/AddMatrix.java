package practice;

public class AddMatrix {
  public static void main(String[] args) {
    int first[][] = {{1, 2}, {3, 4}};
    int second[][] = {{5, 6}, {7, 8}};
    int sum[][] = new int[2][2];

    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < second.length; j++) {
        sum[i][j] = first[i][j] + second[i][j];
      }
    }
    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < second.length; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}
