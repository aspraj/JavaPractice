package practice_questions_for_java_interview;

import java.util.Arrays;
import java.util.OptionalInt;

public class AbsoluteValue {
    public static void main(String args[]) {
        int arr[] = {2,4,7};
        int arrResult[] = new int[arr.length];
        int b;
        if (arr.length > 2) {
            for (int i = 0; i < arr.length; i++) {
                int a = 0;
                for (int j = 0; j < arr.length; j++) {
                    a = a + Math.abs(arr[i] - arr[j]);
                }
                arrResult[i] = a;
                System.out.println(a);
            }
            b = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arrResult[0] > arrResult[i]) {
                    b = i;
                }
                if (arrResult[0] == arrResult[i]) {

                }

            }
            System.out.println("The lowest possible value is when x = " + arr[b] + " so the answer is " + arr[b]);
        } else if(arr.length == 2) {
            System.out.println("Tie");
        }
    }
}
