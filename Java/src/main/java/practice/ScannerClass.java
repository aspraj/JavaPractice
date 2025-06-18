package practice;

import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    sc.nextLine();
    String d = sc.nextLine();
    System.out.println("This is the first input which is a int taken from the user:" + a);
    System.out.println("This is the second input which is a string taken from the user:" + b);
    System.out.println("This is the third input which is a string taken from the user:" + d);
  }
}
