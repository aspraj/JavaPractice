package hundred_questions_for_basic_development;

public interface InterfaceClass {

  private void aman() {
    System.out.println("Yo");
  }

  public int  asp();
}


class asp1 implements InterfaceClass {
  public void aman() {
    System.out.println("asp");
  }

  @Override
  public int asp() {
    return 0;
  }
}
