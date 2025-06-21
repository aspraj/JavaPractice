package hundred_questions_for_basic_development;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCode {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    for(Object i : list){
      System.out.println(i);
    }
    Iterator ite =list.iterator();
    while(ite.hasNext()){
      System.out.println(ite.next());
    }
  }
}
