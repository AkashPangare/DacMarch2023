package dsa.Queue;
import java.util.*;

public class Deq {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);
        d.addLast(5);
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        System.out.println("First element: "+d.getFirst());
        System.out.println("Last element: "+d.getLast());
    }
}
