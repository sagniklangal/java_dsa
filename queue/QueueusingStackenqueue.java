import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueusingStackenqueue {
  
  Stack<Integer> st1 = new Stack<>();
  Stack<Integer> st2 = new Stack<>();

  public void enqueue(int val){
    //Move all elements from stack 1 to stack 2
    while (!st1.isEmpty()) {
      st2.push(st1.pop());
    }
    //Insert value into stack 2
    st2.push(val);
    //Move all elements from stack 2 to stack 1
    while (!st2.isEmpty()) {
      st1.push(st2.pop());
    }
  }

  public int dequeue(){
    if(st1.isEmpty()){
      System.out.println("Queue is Empty");
      return -1;
    }
    
    int val = st1.pop();
    return val;
  }

  public int peek(){
    if(st1.isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    }
    
    int val = st1.peek();
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
