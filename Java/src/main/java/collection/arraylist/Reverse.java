package collection.arraylist;

import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        var list = List.of(2, 3, 4, 5, 6, 7, 4, 3);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        int k = list.size() - 1;
        do {
            System.out.println(list.get(k));
            k--;
        } while (k >= 0);

    }
}
