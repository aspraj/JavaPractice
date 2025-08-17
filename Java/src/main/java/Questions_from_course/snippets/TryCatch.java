package Questions_from_course.snippets;

class Test extends Exception {}

public class TryCatch {
    public static void main(String args[]) {
        try {
            throw new Test();
        } catch (Test t) {
            System.out.println("Catch the Test Exception");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
