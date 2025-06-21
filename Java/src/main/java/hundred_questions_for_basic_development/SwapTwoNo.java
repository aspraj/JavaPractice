package hundred_questions_for_basic_development;

import java.util.Scanner;

public class SwapTwoNo {

  //With using third variable
//  public static void main(String[] args){
//        int c =0;
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    System.out.println("before a: "+ a +"\nbefore b:" + b);
//    c=a;
//    a=b;
//    b=c;
//    System.out.println("after a: "+ a +"\nafter b:" + b);
//  }
//

  // without using third variable
  public static void main(String[] args){
        int c =0;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("before a: "+ a +"\nbefore b:" + b);
    a = a + b;//a =6 + b=5 = 11
    b = a - b;// b = a(11) - b(5) = 6
    a = a - b;// a = a(11) - b(6) = 5
    System.out.println("after a: "+ a +"\nafter b:" + b);
  }



}
