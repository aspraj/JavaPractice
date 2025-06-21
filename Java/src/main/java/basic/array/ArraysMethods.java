package basic.array;

import java.util.Arrays;

public class ArraysMethods {

  public static void main(String[] args) {
    int c = 0;
    int[] numbers = {1, 2, 3, 5, 8};
    int index = Arrays.binarySearch(numbers, 5);
    System.out.println("Index of 5: " + index);

/*

//  sort array elements
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));

//  It is used to find length of an array
    System.out.println(a.length);

//  It is used to print the index value in a array
    System.out.println(a[3]);

//  Directly print the values of a array
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(a));

//  It is used to print the whole array without converting it to string
    for (Integer b : a) {
      c = b + c;
    }
    System.out.println(c);

*/
  }
}
