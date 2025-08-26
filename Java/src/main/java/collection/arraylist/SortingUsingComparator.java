package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("asjryp", "ars", "sadfa", "SADFA", "asdfs", "sda", "asdas", "ghj", "fdthf"));
        List<String> sortedString = new ArrayList<>();
        List<Integer> sortedLength = new ArrayList<>();

        for (String str : list) {
            sortedLength.add(str.length());
        }
        sortedLength = sortedLength.stream().sorted().toList();

        for (int i = 0; i < sortedLength.get(sortedLength.size() - 1); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).length() == i) {
                    sortedString.add(list.get(j));
                }
            }
        }
        System.out.println(sortedString);
    }
}