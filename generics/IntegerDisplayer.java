package generics;

public class IntegerDisplayer {
  Integer num;

  public void setNum(Integer num){
    this.num = num;
  }

  public void display(){
    System.out.println("Element -> " + this.num);
  }
}
