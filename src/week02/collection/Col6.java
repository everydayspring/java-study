package week02.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Col6 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("d", 5);

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        for(int value : map.values()) {
            System.out.println(value);
        }


        

    }
}
