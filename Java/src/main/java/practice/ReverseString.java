package practice;

public class ReverseString {
  public static void main(String[] args) {
    String str = "Hello World";
//    char c[] = str.toCharArray();
//    char d[] = new char[c.length];
//    int j = 0;
//    for (int i = str.length()-1; i>0 ; i--) {
//      d[i] = c[j];
//      j++;
//    }
//    System.out.println(new String(d));

    StringBuilder stringBuilder = new StringBuilder(str);
    stringBuilder.reverse();
    System.out.println(stringBuilder);
  }
}
