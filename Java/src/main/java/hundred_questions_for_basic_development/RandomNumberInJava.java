package hundred_questions_for_basic_development;

import java.util.Random;

public class RandomNumberInJava {
  public static void main(String[] args) {
    Random random = new Random();
    System.out.println(random.nextInt(100));
  }
}
