package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(5);
        queue.add(9);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        queue.add(1);
        queue.add(5);
        queue.add(9);
        queue.add(10);

        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
