public class MyCircularQueue{
	
	int rear;
	int front;
	int size;
	int capacity;
	int[] circularQueue;
	
	public MyCircularQueue(int capacity){
		circularQueue = new int[capacity];
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
		if((front==0 && rear==capacity-1) || (front!=0 && rear==(front-1)%(capacity))){
			return true;
		}
		return false;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Circular queue is empty");
			return -1;
		}
		return circularQueue[front];
	}
	
	public void enqueue(int val){
		if(isFull()){
			System.out.println("Circular queue is full");
			return;
		}
		
		if(isEmpty()){
			front = 0;
			rear = 0;
		} else if(rear==capacity-1 && front!=0){ //Circular insertion
			rear=0;
		} else{ //Normal insertion
			rear++;
		}
		size++;
		circularQueue[rear] = val;
		System.out.println("inserted: "+val);
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Circular queue is empty");
			return -1;
		}
		int num = circularQueue[front];
		
		if(front==rear){
			front = -1;
			rear = -1;
			return num;
		} else if(front==capacity-1){ //Circular deletion
			front = 0;
		}
		else{ //Normal deletion
			front++;
		}
		size--;
		return num;
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("Circular queue is empty");
			return;	
		}
		System.out.print("Elements are: ");
		
		//For circular queue
		if(rear<=front){
			for(int i=front; i<=capacity-1; i++){
			System.out.print(circularQueue[i]);
			System.out.print(",");
			}
			for(int i=0; i<=rear; i++){
			System.out.print(circularQueue[i]);
			if(i!=rear){
				System.out.print(",");
				}
			}
		}	
		
		else{ //Normal printing
			for(int i=front; i<=rear; i++){
			System.out.print(circularQueue[i]);
			if(i!=rear){
				System.out.print(",");
				}
			}
		}
		
		System.out.println();
	}
	
	public void size(){
		int size = circularQueue.length;
		System.out.println("Size is: "+size);
	}
	
	public static void main(String[] args){
		MyCircularQueue cirQueue = new MyCircularQueue(5);
		cirQueue.printQueue();
		System.out.println("Circular queue is empty? "+cirQueue.isEmpty());
		cirQueue.enqueue(1);
		cirQueue.enqueue(2);
		cirQueue.enqueue(3);
		cirQueue.enqueue(4);
		cirQueue.enqueue(5);
		cirQueue.enqueue(6);
		cirQueue.size();
		cirQueue.printQueue();
		int first = cirQueue.peek();
		System.out.println("Front element is: "+first);
		cirQueue.enqueue(6);
		System.out.println("Circular queue is full? "+cirQueue.isFull());
		System.out.println("Circular queue is empty? "+cirQueue.isEmpty());
		
		System.out.println("Deleting elements");
		System.out.println("Deleted: "+cirQueue.dequeue());
		System.out.println("Deleted: "+cirQueue.dequeue());
		System.out.println("Deleted: "+cirQueue.dequeue());
		System.out.println("Deleted: "+cirQueue.dequeue());
		cirQueue.enqueue(6);
		cirQueue.enqueue(7);
		cirQueue.enqueue(8);
		System.out.println("Deleted: "+cirQueue.dequeue());
		System.out.println("Circular queue is empty? "+cirQueue.isEmpty());
		System.out.println("Circular queue is full? "+cirQueue.isFull());
	}

}
