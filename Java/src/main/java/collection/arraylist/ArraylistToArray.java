package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 8, 5, 3, 6, 7, 5, 4, 65, 78, 6));

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (Integer ar : arr)
            System.out.println(ar);
    }
//    int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
//    System.out.println(Arrays.toString(arr));


}
