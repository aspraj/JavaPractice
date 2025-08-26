package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(1);
        list.add(15);
        list.add(9);
        list.add(16);
        list.add(14);
        list.add(18);

        int j = list.get(0);
        for (Integer value : list) {
            if (j < value) {
                j = value;
            }
        }
        System.out.println(j);

        for (Integer integer : list) {
            if (j > integer) {
                j = integer;
            }
        }
        System.out.println(j);

//        for (Integer a : list) {
//            Math.max(list);
//        }
//        int max = Collections.max(numbers);
//        int min = Collections.min(numbers);

    }
}
