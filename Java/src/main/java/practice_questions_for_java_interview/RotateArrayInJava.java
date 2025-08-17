package practice_questions_for_java_interview;

import java.util.Arrays;

public class RotateArrayInJava {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int order = 3;
// Bubble Rotate
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
//        Intermediate Array
//        int newArr[] = new int[arr.length];
//        for (int j = 0; j < shift; j++) {
//            int k = 0;
//            newArr[k] = arr[arr.length - 1];
//            k++;
//            for (int i = 0; i < arr.length - 1; i++) {
//                newArr[k] = arr[i];
//                k++;
//            }
//            for (int l = 0; l < arr.length; l++) {
//                arr[l] = newArr[l];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}