package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class PrintAList {
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("as");
        list.add("asp");
        list.add("asp r");
        list.add("asp ra");
        list.add("asp raj");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(String a : list){
            System.out.println(a);
        }

        list.forEach(System.out::println);

        list.add(2,"Raj");

        list.remove(3);

        list.remove("a");

        boolean existOrNot = list.contains("Jhon");
        System.out.println(existOrNot);





    }
}
