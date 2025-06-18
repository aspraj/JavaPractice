package practice;

public class GarbageCollectionInJava {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.freeMemory());
  }
}
