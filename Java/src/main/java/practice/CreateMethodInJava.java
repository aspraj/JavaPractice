package practice;

public class CreateMethodInJava {
  public static void main(String[] args) {
    CreateMethodInJava obj = new CreateMethodInJava();
    obj.aman();
    staticBlock();
  }
  public static void staticBlock(){
    asp obj = new asp(5);
    System.out.println("This is a static block");
  }
  void aman(){
    System.out.println("hello Aman");
  }
}

class asp{

  void asp(){
    System.out.println("Constructor in asp class");
  }
  public asp(int a){
    System.out.println("Constructor overloaded with a int in asp class");
  }
}

