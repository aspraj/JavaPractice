package collection.arraylist;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 8, 5, 3, 6, 7, 2, 5, 4, 65, 78, 6));
        Set<Integer> removeDuplicates = new HashSet<>(list);
//        Use linkedHAshset to remian order
        System.out.println(removeDuplicates);
        List<Integer> removedDuplicates = new ArrayList<>(list);
        int a = 0;
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            a = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (a == list.get(j)) {
                    list.remove(j);
//                    removedDuplicates.remove(j - b);
                    b++;
                }
            }
        }
        System.out.println(list);
//        System.out.println(removedDuplicates);

    }
}
