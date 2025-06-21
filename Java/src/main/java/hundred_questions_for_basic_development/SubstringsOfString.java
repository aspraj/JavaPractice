package hundred_questions_for_basic_development;

public class SubstringsOfString {
  public static void main(String[] args) {
    String s1 = "hello";

    for(int i = 0; i < s1.length(); i++) {
      for (int j = i+1 ; j <= s1.length(); j++) {
        System.out.print(s1.substring(i, j) + " ");
      }
    }
  }
}
