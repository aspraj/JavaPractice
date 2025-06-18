package practice;

public class ExceptionHandling {
//  public static void main(String[] args) {

//      throw new ArithmeticException(" Here is a arithmetic exception");
//    }

  public static void main(String[] args) {
    try{
      int i = 5/0;
    }catch (ArithmeticException e){
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("this is finally its always executed");
    }
  }

}