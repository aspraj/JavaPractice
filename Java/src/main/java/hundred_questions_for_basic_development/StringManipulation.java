package hundred_questions_for_basic_development;

import java.util.Arrays;

public class StringManipulation {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = " wor ld ";
    String s3 = "Hello";
    String s4 = "1234567890";
    String s5 = "345.34";
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.endsWith("o"));
    System.out.println(s1.indexOf("e"));
    System.out.println(s1.replace('e','o'));
    String a[] = s2.split("r");
    System.out.println(Arrays.toString(a));
    System.out.println(a.length);
    System.out.println("This is printing the length of string" +
      "which is '[wo, ld]': " + Arrays.toString(a).length());
    System.out.println(s2.trim());
    System.out.println(s3.length());
    System.out.println(s3+s2);
    System.out.println(s3.concat(s2));

    System.out.println(s3.replace("ell","ele"));
    System.out.println(Long.parseLong(s4));
    System.out.println(Float.parseFloat(s5));
    System.out.println(Double.parseDouble(s5));




  }
}
