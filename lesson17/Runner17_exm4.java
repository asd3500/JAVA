import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue
 */
public class Runner17_exm4 {
    public static void main(String[] args) {
        Deque<Integer> queue1 = new ArrayDeque<>();

        queue1.add(8);
        queue1.add(7);
        queue1.add(5);

        System.out.println(queue1);

        queue1.offer(10);

        System.out.println(queue1);

        int item = queue1.peek();
        System.out.println(".peek=" + item);
        System.out.println(queue1);

        item = queue1.poll();
        System.out.println(".poll=" + item);
        System.out.println(queue1);

        item = queue1.getLast();
        System.out.println(".getLast=" + item);
        System.out.println(queue1);

        item = queue1.pollLast();
        System.out.println(".pollLast=" + item);
        System.out.println(queue1);

        Queue<Integer> queue2 = new PriorityQueue<>(); // Comparable
        queue2.add(88);
        queue2.add(777);
        queue2.add(5);
        queue2.add(222);
        System.out.println(queue2);

    }
}
