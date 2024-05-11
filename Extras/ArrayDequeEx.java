import java.util.ArrayDeque;
import java.util.Deque;

class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(3);
        System.out.println(d);

        d.addFirst(2);
        System.out.println(d);

        d.addFirst(1);
        System.out.println(d);

        d.addLast(4);
        System.out.println(d);

        d.addLast(5);
        System.out.println(d);

        d.pollFirst();
        System.out.println(d);

        d.pollLast();
        System.out.println(d);
    }    
}