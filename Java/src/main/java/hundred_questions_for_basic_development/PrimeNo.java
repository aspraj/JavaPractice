package hundred_questions_for_basic_development;

import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int j =0;
// 1 2 3 5 7 11 13 17
    if(isPrime(n)){
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }
  }
  static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i*i <=n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

}
