import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueuepush {

  Queue<Integer> q1 = new LinkedList<>();
  Queue<Integer> q2 = new LinkedList<>();

  public void push(int val){
    while (!q1.isEmpty()) {
      q2.offer(q1.poll());
    }
    q1.offer(val);
    while (!q2.isEmpty()) {
      q1.offer(q2.poll());
    }
  }

  public int pop(){
    if (q1.isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    return q1.poll();
  }

  public int peek(){
    if (q1.isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    return q1.peek();
  }

  public static void main(String[] args) {
   StackusingQueuepush stack = new StackusingQueuepush();
   stack.push(10);
   System.out.println(stack.peek()); //10
   stack.push(20);
   stack.push(30);
   stack.push(40);
   System.out.println(stack.peek()); //40
   System.out.println(stack.pop()); //40
   System.out.println(stack.peek()); //30
  }
}