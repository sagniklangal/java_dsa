package generics;

public class CustomDisplayer<T extends College> {
  T num;

  public void setNum(T num){
    this.num = num;
    this.num.printCollegeName();
  }

  public void display(){
    System.out.println("Element -> " + this.num);
  }
}
