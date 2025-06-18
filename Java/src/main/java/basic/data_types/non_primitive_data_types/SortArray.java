package basic.data_types.non_primitive_data_types;

import java.util.Arrays;

public class SortArray {

  public static void main(String[] args) {

    int arr[] = {3,76,2,498,4};
    int temp;

    for(int i=0;i<arr.length;i++) {
      for(int j=i;j<arr.length;j++) {
        if (arr[i] >= arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
