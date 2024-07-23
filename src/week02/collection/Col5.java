package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(12);
        set.add(5);
        set.add(9);
        set.add(1);
        set.add(12);


        for (Integer i : set) {
            System.out.println(i);
        }

        System.out.println(set.contains(2));
        System.out.println(set.contains(5));
    }
}
