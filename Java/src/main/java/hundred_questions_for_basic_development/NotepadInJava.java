package hundred_questions_for_basic_development;

import java.io.IOException;

public class NotepadInJava {
  public static void main(String[] args) throws IOException {
    Runtime runtime = Runtime.getRuntime();
    runtime.exec("notepad");
  }
}
