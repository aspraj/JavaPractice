package hundred_questions_for_basic_development;

import java.util.Scanner;

public class farhenhietToCelcius {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temp in farenheit");
    int temperatue = sc.nextInt();
    temperatue = ((temperatue - 32)*5)/9;
    System.out.println("This is the temp in celsius value:" + temperatue);
    }
}
