package hundred_questions_for_basic_development;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy zz");
    String str = format.format(date);
    System.out.println(str);

    String s = "Thu, Dec 31 1998";
    Date date1 = new Date();
    date1.parse(s);
    System.out.println(date1);
  }
}
