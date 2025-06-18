package practice;

import java.util.Scanner;

public class LargestOf3No {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int o = scanner.nextInt();

    if (n >= m && n >= o) {
      System.out.println(n + " is largest");
    }
    else if (o >= m && o >= n) {
      System.out.println(o + " is largest");
    }
    else if (m >= n && m >= o) {
      System.out.println(m + " is largest");
    }
  }
}
