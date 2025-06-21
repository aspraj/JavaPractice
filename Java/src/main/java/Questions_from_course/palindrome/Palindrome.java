package Questions_from_course.palindrome;


public class Palindrome {
    // write code here
    public static void main(String args[]) {
        boolean a = isPalindrome(1234321);
        System.out.println(a);

    }

    public static boolean isPalindrome(int number) {

        int b = 0;
        int original = number;
        for (int i = Integer.toString((number)).length() - 1; i >= 0; i--) {

            b = b * 10 + number % 10;

            number = number / 10;
        }
        System.out.println(b);
        return b == original;
    }
}