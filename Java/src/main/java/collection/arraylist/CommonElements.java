package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 8, 5, 3, 6, 7, 5, 4, 65, 78, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(75, 765, 3, 6, 85, 86, 4, 6));
        List<Integer> commonElements = new ArrayList<>();

        for (Integer list1Elements : list1) {
            if (list2.contains(list1Elements) && !commonElements.contains(list1Elements)) {
                commonElements.add(list1Elements);
            }
        }
        System.out.println(commonElements);
    }
}
