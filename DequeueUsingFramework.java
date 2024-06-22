package QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueUsingFramework {
    public static void main(String[] args) {
        Deque<Integer>de=new LinkedList<>();
        de.addFirst(1);
        de.addLast(2);
        de.addFirst(3);
        de.addLast(4);
        de.addFirst(5);
        System.out.println(de.size());
        System.out.println(de.removeFirst());
        System.out.println(de.removeLast());
        System.out.println(de.size());
    }
}
