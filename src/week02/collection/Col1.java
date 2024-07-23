package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {

        // List

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(2));

        intList.set(2, 10);
        System.out.println(intList.get(2));

        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));

        intList.clear();
        System.out.println(intList.toString());


    }
}
