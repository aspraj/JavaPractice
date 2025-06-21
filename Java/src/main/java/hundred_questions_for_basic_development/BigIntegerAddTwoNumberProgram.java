package hundred_questions_for_basic_development;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerAddTwoNumberProgram {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n1 = in.nextInt();
//    int n2 = in.nextInt();
//    System.out.println(n1 + n2);
//  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String n1 = in.nextLine();
    String n2 = in.nextLine();
    BigInteger n3 = new BigInteger(n1);
    BigInteger n4 = new BigInteger(n2);
    System.out.println(n3.add(n4));
  }

}
