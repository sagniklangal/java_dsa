package generics;

public class DoubleDisplayer {
  Double num;

  public void setNum(Double num){
    this.num = num;
  }

  public void display(){
    System.out.println("Element -> " + this.num);
  }
}
