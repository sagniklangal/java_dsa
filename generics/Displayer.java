package generics;

public class Displayer<T> {
  T num;

  public void setNum(T num){
    this.num = num;
  }

  public void display(){
    System.out.println("Element -> " + this.num);
  }
}
