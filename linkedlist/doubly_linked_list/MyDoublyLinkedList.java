package linkedlist.doubly_linked_list;

import linkedlist.doubly_linked_list.DoublyNode;

public class MyDoublyLinkedList<T> {
  DoublyNode<T> head;
  DoublyNode<T> tail;
  int size;
  public MyDoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

public void insertNode(T data, int position){
  if (position>size+1 || position<=0) {
    System.out.println("Wrong input");
    return;
  }
  //head
  if (position == 1) {
    insertHead(data);
    return;
  }
  //tail
  else if (position==size+1) {
    insertTail(data);
    return;
  }
  //specific part insertion
  else{
    int counter = 1;
    DoublyNode<T> newNode = new DoublyNode<>(data);
    DoublyNode<T> temp = head;
    while (counter<position-1 && temp!=null) {
      counter++;
      temp = temp.next;
    }
    DoublyNode<T> currentNode = temp.next;
    
    newNode.next = currentNode;
    currentNode.prev = newNode;
    temp.next = newNode;
    newNode.prev = temp;

    size++;
  }
  System.out.println("Insertion is successful at position " + position);
}

public void insertHead(T data){
  DoublyNode<T> newNode = new DoublyNode<>(data);
  //if linkedlist is empty
  if(head == null){
    head = newNode;
    tail = newNode;
    System.out.println("Insertion at head is successful");
    size++;
    return;
  }
  newNode.next = head;
  head.prev = newNode;
  head = newNode;
  System.out.println("Insertion at head is successful");
  size++;
}

public void insertTail(T data){
  DoublyNode<T> newNode = new DoublyNode<>(data);
  //if linkedlist is empty
  if(head == null){
    head = newNode;
    tail = newNode;
    System.out.println("Insertion at tail is successful");
    size++;
    return;
  }
  DoublyNode<T> temp = head;
  while (temp.next!=null) {
    temp = temp.next;
  }

  temp.next = newNode;
  newNode.prev = temp;
  tail = newNode;
  System.out.println("Insertion at tail is successful");
  size++;
}

public void printList(){
  if (head == null) {
    System.out.println("The list is empty");
    return;
  }
  DoublyNode<T> temp = head;
  while (temp!=null) {
    System.out.println("Data is -> " + temp.data);
    temp = temp.next;
  }
}

public void printListInReverse(){
  DoublyNode<T> temp = tail;
  while (temp!=null) {
    System.out.println("Data is -> " + temp.data);
    temp = temp.prev;
  }
}

//deletion at head
public void deleteHead(){
  //if linkedlist is empty
  if(head == null){
    System.out.println("Deletion at head is successful");
    return;
  }
  DoublyNode<T> temp = head;
  head = head.next;
  temp.next = null;
  if (head == null) {
    //If there is only one element
    tail = null;
  } else{
    head.prev = null;
  }
  size--;
  System.out.println("Deletion at head is successful");
}

//deletion at tail
public void deleteTail(){
  if (head == null) {
    System.out.println("Linked list is empty");
    return;
  }
  //for single element
  if (head.next==null) {
    head = null;
    tail = null;
    size--;
    System.out.println("Deletion at tail is successful");
    return;
  }
  
  DoublyNode<T> prevNode = null;
  DoublyNode<T> temp = head;
  while (temp.next!=null) {
    prevNode = temp;
    temp = temp.next;
  }
  prevNode.next = null;
  temp.prev = null;
  tail = prevNode;
  System.out.println("Deletion at tail is successful");
  size--;
}

//deletion at specific index
public void deleteNode(int position){
  if (position>size || position<=0) {
    System.out.println("Wrong input");
    return;
  }
  //head
  if (position == 1) {
    deleteHead();
    return;
  }
  //tail
  else if (position==size) {
    deleteTail();
    return;
  }
  //specific part deletion
  else{
    int counter = 1;
    //DoublyNode<T> prevNode = null;
    DoublyNode<T> temp = head;
    while (counter<position && temp!=null) {
      counter++;
      //prevNode = temp;
      temp = temp.next;
    }

    if (temp == null || temp.next == null) {
      System.out.println("Invalid Position");
      return;
    }

    DoublyNode<T> prevNode = temp.prev;
    DoublyNode<T> nextNode = temp.next;

    prevNode.next = nextNode;
    nextNode.prev = prevNode;
    
    temp.prev = null;
    temp.next = null;

    // prevNode.next = temp.next;
    // temp.next = null;
    size--;
    System.out.println("Deletion is successful at position " + position);
  }
}

public void updateNode(int position, T updatedVal){
  if (head==null) {
    System.out.println("Linked list is empty");
    return;
  }
  int counter = 1;
  DoublyNode<T> temp = head;
  while (counter<position && temp!=null) {
    temp = temp.next;
    counter++;
  }
  if (temp!=null && counter == position) {
    temp.data = updatedVal;
  } else{
    System.out.println("Size of linked list is smaller than position " + position);
    return;
  }
  System.out.println("Update at position " + position + " was successful");
}

public boolean searchNode(T searchedValue){
  if (head == null) {
    return false;
  }
  
  int counter = 1;
  DoublyNode<T> temp = head;
  while (temp!=null) {
    if (temp.data == searchedValue) {
      System.out.println(searchedValue + " is found at position " + counter);
      return true;
    }
    counter++;
    temp = temp.next;
  }
  System.out.println("Not found");
  return false;
}
}
