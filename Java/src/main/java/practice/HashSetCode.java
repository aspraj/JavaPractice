package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCode {
  public static void main(String[] args) {
//    Set<String> set = new TreeSet<>();
//    set.add("b");
//    set.add("b");
//    set.add("a");
//    System.out.println("This is a tree set" + set);
//
//    for (String s : set) {
//      {
//        System.out.println(s);
//      }
//    }

//    Set<String> set = new HashSet<>();
//    set.add("b");
//    set.add("b");
//    set.add("a");
//    System.out.println("This is a hash set" + set);
//
//    for (String s : set) {
//      {
//        System.out.println(s);
//      }
//    }

    Set<String> set = new LinkedHashSet<>();
    set.add("b");
    set.add("a");
    set.add("a");
    System.out.println("This is a linkedHashSet set" + set);

    for (String s : set) {
      {
        System.out.println(s);
      }
    }
  }
}
