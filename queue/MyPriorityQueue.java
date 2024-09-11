import java.util.*;
public class MyPriorityQueue {
  public static void main(String[] args) {
    //Priority queue uses heap (min-heap as default)
    
    // Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); //max-heap
    
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    // Queue<Integer> queue = new PriorityQueue<>();

    queue.offer(5);
    queue.offer(7);
    queue.offer(1);
    queue.offer(8);

    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue);


    //List
    List<Integer> list = new ArrayList<>();
    list.add(6);
    list.add(1);

    Collections.sort(list);
    System.out.println(list);
  }
}
