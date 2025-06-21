package hundred_questions_for_basic_development;

import java.util.Scanner;

public class FactorialOfANumber {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int factorial = 1;
//    for (int i = 1; i <= n; i++) {
//      factorial = factorial * i;
//    }
//    System.out.println(factorial);
//  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    long factorial = 1;
    for(long i = 1; i <= s; i++) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
  }
}
