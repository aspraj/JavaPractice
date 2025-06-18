package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
//    int a = 10;
//    while (n >= 0) {
//      System.out.println(n);
//      n--;


//      List<String> names = List.of("Alice", "Bob", "Charlie");
//      Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//          System.out.println(iterator.next());
//      }
      do{
        n--;
        if(n==5) {
          continue;
        }
        if(n==3) {
          break;
        }
        System.out.println(n);

    }while(n>=0);
  }
}