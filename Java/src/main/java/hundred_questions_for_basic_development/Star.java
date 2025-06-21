package hundred_questions_for_basic_development;

import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for(int i=n; i>=0; i--) {
      for(int j=i; j>=0; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
