package practice;

import java.util.Queue;

public class PriorityQueue {
  public static void main(String[] args) {
    Queue<String> str = new java.util.PriorityQueue<>();
    str.add("a");
    str.add("b");
    str.add("c");
    str.add("d");
    str.add("e");
    System.out.println(str.poll());
    System.out.println(str.remove());
    System.out.println(str.element());

  }
}
