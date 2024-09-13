package generics;

public class UsingObject {
  Object num;

  public void setNum(Object num){
    this.num = num;
  }

  public void display(){
    System.out.println("Element -> " + this.num);
  }
}
