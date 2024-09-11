import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueusingStack {
  
  Stack<Integer> st1 = new Stack<>();
  Stack<Integer> st2 = new Stack<>();

  public void enqueue(int val){
    st1.push(val);
  }

  public int dequeue(){
    if(st1.isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    }
    
    while (!st1.isEmpty()) {
      int element = st1.pop();
      st2.push(element);

      //st2.push(st1.pop());
    }
    int val = st2.pop();
    
    while (!st2.isEmpty()) {
      st1.push(st2.pop());
    }

    return val;
  }

  public int peek(){
    if(st1.isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    }
    
    while (!st1.isEmpty()) {
      int element = st1.pop();
      st2.push(element);

      //st2.push(st1.pop());
    }
    int val = st2.peek();
    
    while (!st2.isEmpty()) {
      st1.push(st2.pop());
    }

    return val;
  }

  public static void main(String[] args) {
    QueueusingStack queue = new QueueusingStack();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println("Peek is: "+queue.peek());
    System.out.println("Dequeue is: "+queue.dequeue());
    queue.enqueue(7);
    System.out.println("Peek is: "+queue.peek());
  }
}
