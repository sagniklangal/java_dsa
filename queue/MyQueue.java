public class MyQueue{
	
	int rear;
	int front;
	int size;
	int capacity;
	int[] queue;
	
	public MyQueue(int capacity){
		queue = new int[capacity];
		this.capacity = capacity;
		size = 0;
		rear = front = -1;
	}
	
	public boolean isEmpty(){
		if(front==-1 || rear==-1){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if(rear==capacity-1){
			return true;
		}
		return false;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[front];
	}
	
	public void enqueue(int val){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		
		if(isEmpty()){
			front = 0;
			rear = 0;
		} else {
			rear++;
		}
		size++;
		queue[rear] = val;
		System.out.println("inserted: "+val);
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		int num = queue[front];
		
		if(front==rear){
			front = -1;
			rear = -1;
			return num;
		} else{
			front++;
		}
		return num;
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;	
		}
		System.out.print("Elements are: ");
		for(int i=front; i<=rear; i++){
			System.out.print(queue[i]);
			if(i!=rear){
				System.out.print(",");
			}
		}
		System.out.println();
	}
	
	public void size(){
		int size = queue.length;
		System.out.println("Size is: "+size);
	}
	
	public static void main(String[] args){
		MyQueue myQueue = new MyQueue(5);
		myQueue.printQueue();
		System.out.println("Queue is empty? "+myQueue.isEmpty());
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		myQueue.size();
		myQueue.printQueue();
		int first = myQueue.peek();
		System.out.println("Front element is: "+first);
		myQueue.enqueue(6);
		System.out.println("Queue is full? "+myQueue.isFull());
		System.out.println("Queue is empty? "+myQueue.isEmpty());
		
		System.out.println("Deleting elements");
		System.out.println("Deleted: "+myQueue.dequeue());
		System.out.println("Deleted: "+myQueue.dequeue());
		System.out.println("Deleted: "+myQueue.dequeue());
		System.out.println("Deleted: "+myQueue.dequeue());
		System.out.println("Deleted: "+myQueue.dequeue());
		System.out.println("Queue is empty? "+myQueue.isEmpty());
		System.out.println("Queue is full? "+myQueue.isFull());
	}

}
