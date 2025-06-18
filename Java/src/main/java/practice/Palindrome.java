package practice;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = 0;
    String s = String.valueOf(a);
//    System.out.println(s);
    char c[] = s.toCharArray();
//    System.out.println(Arrays.toString(c));
    char d[] = new char[c.length];
    for (int i = c.length - 1; i >= 0; i--) {
      if (c[i] == c[b]) {
        b++;
      }
    }
    if (b == c.length) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not Palindrome");
    }
  }
}
