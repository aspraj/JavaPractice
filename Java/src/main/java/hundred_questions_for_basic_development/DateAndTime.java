package hundred_questions_for_basic_development;


import java.sql.Date;
import java.util.Calendar;

public class DateAndTime {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getTime());
    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.DATE));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.getTime());

    String dateStr = "2025-03-08";
    Date date = Date.valueOf(dateStr);
    System.out.println(date);

//    Date date = new Date();
    System.out.println(date);
    System.out.println(date.getDay());
  }
}
