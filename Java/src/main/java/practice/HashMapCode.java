package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCode {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap();
    map.put("key1", "value1");
    map.put("key2", "value2");
    System.out.println(map);
    for (String ma : map.values()) {
      System.out.println(ma);

//      Iterator ite = map.entrySet().iterator();
//      while (ite.hasNext()) {
//        System.out.println(ite.next());
//      }

//      for (String ma : map.keySet()) {
//        System.out.println(ma);

//      for (Map.Entry<String, String> ma : map.entrySet()) {
//        System.out.println(ma);
    }
  }
}
