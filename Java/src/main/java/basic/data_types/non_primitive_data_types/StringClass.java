package basic.data_types.non_primitive_data_types;

import java.rmi.NotBoundException;
import java.util.Arrays;

/*
Strings are defined as an array of characters.
string is designed to hold a sequence of characters in a single variable
 */
class StringClass {

  static void NullConcat(){
    String aNullString = null;
    System.out.println(aNullString +" Car");
  }

  public static void main(String[] args) {

    String realOne = "String";
    String concatenatedString = realOne.concat("Concat");
    int lengthOfString = concatenatedString.length();
    String subStringFromConcatenatedString = concatenatedString.substring(0,6);
    char characterExtraction = concatenatedString.charAt(6);
    String upperCaseString = realOne.toUpperCase();
    String lowerCaseString = realOne.toLowerCase();
    int comparisionOfTwoString = concatenatedString.compareTo(realOne);
    boolean ignoreCase = realOne.equalsIgnoreCase(upperCaseString);
    boolean withoutIgnoreCase = realOne.equals(upperCaseString);
    int findCharactersInConcatenatedString = concatenatedString.indexOf("Con");
    int lastIndexOfString = realOne.lastIndexOf(concatenatedString);
    String replaceString = concatenatedString.replace("Concat", "String");
    String[] splittingIntoArray = concatenatedString.split("n");
    concatenatedString = " " + concatenatedString + " ";

    System.out.println(realOne);
    System.out.println(concatenatedString);
    System.out.println(lengthOfString);
    System.out.println(subStringFromConcatenatedString);
    System.out.println(characterExtraction);
    System.out.println(upperCaseString);
    System.out.println(lowerCaseString);
    System.out.println(comparisionOfTwoString);
    System.out.println(ignoreCase);
    System.out.println(withoutIgnoreCase);
    System.out.println(findCharactersInConcatenatedString);
    System.out.println(lastIndexOfString);
    System.out.println(replaceString);
    System.out.println(splittingIntoArray);
    System.out.println(Arrays.toString(splittingIntoArray));
    System.out.println(Arrays.toString(splittingIntoArray).length());
    System.out.println(splittingIntoArray.length);
    for(String arrayValue : splittingIntoArray) {
      System.out.print(arrayValue);
    }
    System.out.println("\nbefore trim:"+concatenatedString);
    System.out.println("after trim:"+concatenatedString.trim());





    NullConcat();




  }
}
//
//
//public class Geeks {
//  public static void main(String[] args) {
//    try {
//      System.out.println("Inside try");
//      throw new NotBoundException("asdfghjkl;lkjhgfdfghjkl");
//    } catch (Exception e){
//      System.out.println(e);
//    } finally {
//      System.out.println("Inside finally");
//    }
//  }
//}