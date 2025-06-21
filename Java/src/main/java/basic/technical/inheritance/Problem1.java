package basic.technical.inheritance;

public class Problem1 {
  public static void main(String[] args) {
    String X = "iefyto";
    String Y = "qwertyuiop";
    String Z = "";

    for(int i = 0; i<Y.length(); i++) {
      String c = String.valueOf(Y.charAt(i));
      if(X.contains(c)){
        Z = Z + c;
      }
    }

    for(int i = 0; i<X.length(); i++) {
      String c = String.valueOf(X.charAt(i));
      if(!Z.contains(c)){
        Z = Z + c;
      }
    }
    System.out.println(Z);
  }
}
