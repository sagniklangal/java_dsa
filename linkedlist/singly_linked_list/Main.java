package linkedlist.singly_linked_list;

public class Main{
  public static void main(String[] args){
    MyLinkedList<Integer> obj = new MyLinkedList<>();
    obj.insertTail(10);
    obj.printList();
    obj.insertTail(20);
    obj.printList();
    obj.insertHead(5);
    obj.printList();
    obj.insertNode(40, 5);
    
    
    obj.insertNode(40, 4);
    obj.printList();
    obj.insertNode(35, 4);
    obj.printList();
    obj.insertNode(50, 3);
    obj.printList();
    obj.insertTail(60);
    obj.printList();
    obj.insertTail(70);

    
    obj.deleteTail();
    obj.printList();
    obj.deleteHead();
    obj.printList();
    obj.deleteNode(3);
    obj.printList();
    obj.deleteNode(1);
    obj.deleteNode(3);
    obj.printList();

    obj.updateNode(2, 50);
    obj.updateNode(1, 35);
    
    obj.printList();
    obj.updateNode(4, 100);

    obj.searchNode(50);
    obj.searchNode(60);
    obj.searchNode(35);
  }
}
