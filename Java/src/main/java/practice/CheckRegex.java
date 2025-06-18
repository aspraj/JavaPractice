package practice;

import java.util.regex.Pattern;

public class CheckRegex {
  public static void main(String[] args) {
    String regex = "^[A-Za-z0-9]+$";
    boolean ans = isValidRegex(regex);
    System.out.println("is Valid: "+ ans);
  }

  public static boolean isValidRegex(String regex) {
    try{
      Pattern.compile(regex);
      return true;
    }
    catch(Exception e){
      return false;
    }
  }
}
