package hundred_questions_for_basic_development;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int a[] = {1, 7, 39, 9};
    int temp = 0;
//    Arrays.sort(a);
//    System.out.println(Arrays.toString(a));
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
//        if (a[i] >= a[j]) {
//          temp = a[j];
//          a[j] = a[i];
//          a[i] = temp;
//        }
        if (a[i] > a[j]) {
          a[i] = a[i] + a[j];
          a[j] = a[i] - a[j];
          a[i] = a[i] - a[j];
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }
}
