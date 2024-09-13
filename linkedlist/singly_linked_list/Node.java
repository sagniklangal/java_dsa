package linkedlist.singly_linked_list;

public class Node<T>{
  T data;
  public Node<T> next;
  public Node()//Default constructor
  {
    this.next = null;
  }
  Node(T data)//Parameterised constructor
  {
    this.next = null;
    this.data = data;
  }
}
