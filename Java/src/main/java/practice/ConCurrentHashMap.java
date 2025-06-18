package practice;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConCurrentHashMap {
  public static void main(String[] args) {
    Map<String, Integer> map = new ConcurrentHashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    System.out.println(map);

    Iterator itr = map.entrySet().iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

//    Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
//    while(itr.hasNext()){
//      System.out.println(itr.next());
//    }
  }
}
