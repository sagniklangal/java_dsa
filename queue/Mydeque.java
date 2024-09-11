import java.util.*;
public class Mydeque {
  public static void main(String[] args) {
    Deque<Integer> queue = new ArrayDeque<>();
    // Deque<Integer> queue = new LinkedList<>();

    queue.offer(5);
    queue.offer(7);
    queue.offer(1);
    queue.offer(8);

    System.out.println(queue);
    // System.out.println(queue.peek());
    // System.out.println(queue);
    // System.out.println(queue.poll());
    // System.out.println(queue);

    System.out.println(queue.offerFirst(9));
    System.out.println(queue.peekFirst());
    System.out.println(queue.peekLast());
    System.out.println(queue);
    
    System.out.println(queue.offerLast(10));
    System.out.println(queue);
    System.out.println(queue.poll());

    System.out.println(queue);
    System.out.println(queue.pollFirst());
    System.out.println(queue.peekLast());

    System.out.println(queue.poll());

    System.out.println(queue);
  }
}
