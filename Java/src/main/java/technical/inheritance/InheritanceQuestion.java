package technical.inheritance;

public class InheritanceQuestion {

  public static void main(String[] args) {
//    Upcasting
    Vehicle v = new Car();
    v.late();

  }
}

class Vehicle{
  void late(){
    System.out.println("Vehicle is late");
  }
}

class Car extends Vehicle{
  void late(){
    System.out.println("Car is late");
  }
}
