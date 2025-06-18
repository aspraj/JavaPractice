package practice;

public class RecursionFactorial {
  public static void main(String[] args) {
    int factorial = 5;
    System.out.println(factorial(factorial));
  }

  static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
