package practice;

import java.util.Scanner;

public class ArmStrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b;
    int sum = 0;
    int d = a;
    double a1 = 1;
    while (d > 0) {
      b = d % 10;
//      for (int i = 0; i < String.valueOf(a).length(); i++) {
//        a1 = a1 * b;
//        System.out.println(a1);
//      }
      a1 = Math.pow(b,String.valueOf(a).length());
      sum = (int) (a1 + sum);
      d = d / 10;
//      System.out.println(" b=" + b + " c=" + sum + " d=" + d);
      a1 = 1;
    }
    if (a == sum) {
      System.out.println("armstrongno");
    }

  }
}
