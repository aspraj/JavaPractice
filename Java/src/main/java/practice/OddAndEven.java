package practice;

import java.util.Scanner;

public class OddAndEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no to know its even or odd number ");
    try {
      int i = sc.nextInt();

      if (i % 2 == 0) {
        System.out.println("Even number");
      }
      else if (i % 2 != 0) {
        System.out.println("Odd number");
      }
      else if (i < 0) {
        System.out.println("negative number");
      }
      else {
        System.out.println("Invalid number");
      }
    }
    catch (Exception e) {
      System.out.println("Invalid number");
    }
  }
}
