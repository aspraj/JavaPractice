package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AscendingDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(1);
        list.add(15);
        list.add(9);
        list.add(16);
        list.add(154);
        list.add(18);

        List<Integer> listDesending = new ArrayList<>();

        for (int i = 0; i <= list.size() - 1; ) {
            int k = list.get(0);
            if (!listDesending.contains(list.get(i))) {
                for (int j = 0; j <= list.size() - 1; j++) {
                    if (k < list.get(j)) {
                        k = list.get(j);
                    }
                }
                listDesending.add(k);
                list.remove(list.indexOf(k));
            }
        }
        System.out.println(listDesending);

        listDesending = listDesending.stream().sorted().toList();
        System.out.println(listDesending);

    }
}
