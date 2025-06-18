package practice;

public class CompareString {
  public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = "a";
    String d = "A";
    int e = 4;
    int f = 6;
    System.out.println(b.compareTo(a));
    System.out.println(a == b);
    System.out.println(a.equals(c));
    System.out.println(a.equals(d));
    System.out.println(a.equalsIgnoreCase(d));
  }
}
