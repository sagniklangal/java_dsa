public class Dequeue{
	
	int rear;
	int front;
	int size;
	int capacity;
	int[] dequeue;
	
	public Dequeue(int capacity){
		dequeue = new int[capacity];
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
		if((front==0 && rear==capacity-1) || (front!=0 && rear==(front-1)%(capacity))){ //Due to unknown no of circles
			return true;
		}
		return false;
	}
	
	public int peekFront(){
		if(isEmpty()){
			System.out.println("Dequeue is empty");
			return -1;
		}
		return dequeue[front];
	}
	
	public int peekRear(){
		if(isEmpty()){
			System.out.println("Dequeue is empty");
			return -1;
		}
		return dequeue[rear];
	}
	
	public void enqueueRear(int val){
		if(isFull()){
			System.out.println("Dequeue is full");
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
		dequeue[rear] = val;
		System.out.println("Rear inserted: "+val);
	}
	
	public void enqueueFront(int val){
		if(isFull()){
			System.out.println("Dequeue is full");
			return;
		}
		
		if(isEmpty()){
			front = 0;
			rear = 0;
		} else if(front==0 && rear!=capacity-1){ //Circular insertion
			front=capacity-1;
		} else{ //Normal insertion
			front--;
		}
		size++;
		dequeue[front] = val;
		System.out.println("Front inserted: "+val);
	}
	
	public int dequeueFront(){
		if(isEmpty()){
			System.out.println("Dequeue is empty");
			return -1;
		}
		int num = dequeue[front];
		
		if(front==rear){
			front = -1;
			rear = -1;
		} else if(front==capacity-1){ //Circular deletion
			front = 0;
		}
		else{ //Normal deletion
			front++;
		}
		size--;
		return num;
	}
	
	public int dequeueRear(){
		if(isEmpty()){
			System.out.println("Dequeue is empty");
			return -1;
		}
		int num = dequeue[rear];
		
		if(front==rear){
			front = -1;
			rear = -1;
		} else if(rear==0){ //Circular deletion
			rear = capacity-1;
		}
		else{ //Normal deletion
			rear--;
		}
		size--;
		return num;
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("Dequeue is empty");
			return;	
		}
		System.out.print("Elements are: ");
		
		//For circular queue
		if(rear<=front){
			for(int i=front; i<=capacity-1; i++){
			System.out.print(dequeue[i]);
			System.out.print(",");
			}
			for(int i=0; i<=rear; i++){
			System.out.print(dequeue[i]);
			if(i!=rear){
				System.out.print(",");
				}
			}
		}	
		
		else{ //Normal printing
			for(int i=front; i<=rear; i++){
			System.out.print(dequeue[i]);
			if(i!=rear){
				System.out.print(",");
				}
			}
		}
		
		System.out.println();
	}
	
	public void size(){
		int size = dequeue.length;
		System.out.println("Size is: "+size);
	}
	
	public static void main(String[] args){
		Dequeue dq = new Dequeue(5);
		dq.printQueue();
		System.out.println("Dequeue is empty? "+dq.isEmpty());
		dq.enqueueFront(1);
		dq.enqueueRear(2);
		dq.enqueueRear(3);
		dq.enqueueFront(4);
		dq.enqueueRear(5);
		dq.enqueueFront(6);
		dq.size();
		dq.printQueue();
		int first = dq.peekFront();
		System.out.println("Front element is: "+first);
		int last = dq.peekRear();
		System.out.println("Rear element is: "+last);
		dq.enqueueFront(6);
		System.out.println("Dequeue is full? "+dq.isFull());
		System.out.println("Dequeue is empty? "+dq.isEmpty());
		
		System.out.println("Deleting elements");
		System.out.println("Deleted: "+dq.dequeueRear());
		System.out.println("Deleted: "+dq.dequeueFront());
		System.out.println("Deleted: "+dq.dequeueRear());
		System.out.println("Deleted: "+dq.dequeueFront());
		dq.enqueueRear(6);
		dq.enqueueFront(7);
		dq.enqueueRear(8);
		System.out.println("Deleted: "+dq.dequeueFront());
		System.out.println("Dequeue is empty? "+dq.isEmpty());
		System.out.println("Dequeue is full? "+dq.isFull());
		dq.printQueue();
	}

}
