//Array implementation

public class StackArray {
  int stack[];
  int top;
  int size;

  //Constructor, used to initialize the class variables
  public StackArray(int stackSize){
    stack = new int[stackSize];
    size = stackSize;
    top = -1;
  }

  //insert
  public void push(int element){
    if(top >= size-1){
      System.out.println("Stack is full - overflow");
      return;
    }
    top++;
    stack[top] = element;
  }

  public boolean isEmpty(){
    return top <= -1;
  }

  public int size(){
    return top+1;
  }

  public int peek(){
    if(isEmpty()){
      System.out.println("Stack is empty");
      return Integer.MIN_VALUE;
    }
    return stack[top];
  }

  public int pop(){
    int val = peek();
    //When stack is not empty
    if(val != Integer.MIN_VALUE){
      top--;
    }
    return val;
  }

  public void printStack(){
    System.out.println("Printing stack");
    //In the for loop i<=top is used as if there is only one element then top will be 0. Then 0<0 will not be true and the loop will not get executed and the element will not be printed
    for(int i=0; i<=top; i++){
      System.out.print(stack[i]);
      if(i!=top){
        System.out.print(",");
      }
    }
    System.out.println();
  }
  public static void main(String[] args){
    int n = 5; //Take user input
    StackArray stack = new StackArray(n);

    System.out.println("isEmpty:"+ stack.isEmpty());
    stack.push(9);
    stack.printStack();
    stack.push(1);
    stack.printStack();
    stack.push(8);
    stack.printStack();
    stack.push(5);
    stack.printStack();
    stack.push(8);
    stack.printStack();
    stack.push(2);
    stack.printStack();
  }
}
