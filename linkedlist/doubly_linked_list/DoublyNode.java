package linkedlist.doubly_linked_list;

public class DoublyNode<T>{
  T data;
  DoublyNode<T> next;
  DoublyNode<T> prev;
  DoublyNode()//Default constructor
  {
    this.next = null;
    this.prev = null;
  }
  DoublyNode(T data)//Parameterised constructor
  {
    this.next = null;
    this.data = data;
    this.prev = null;
  }
}
