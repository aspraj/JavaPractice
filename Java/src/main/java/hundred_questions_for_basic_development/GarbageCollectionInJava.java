package hundred_questions_for_basic_development;

public class GarbageCollectionInJava {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.freeMemory());
  }
}
