package generics;

public class MyGeneric {
  public <E> void heyGen(E element){
    System.out.println("Hi Generics " + element);
  }
  public static void main(String[] args) {
    MyGeneric mg = new MyGeneric();
    mg.heyGen("Sagnik");
    
    //IntegerDisplayer
    IntegerDisplayer obj = new IntegerDisplayer();
    obj.setNum(20);
    obj.display();

    //DoubleDisplayer
    DoubleDisplayer obj1 = new DoubleDisplayer();
    obj1.setNum(20.0);
    obj1.display();

    //Generics integer
    Displayer<Integer> obj2 = new Displayer<>();
    obj2.setNum(20);
    obj2.display();
    
    //Generics double
    Displayer<Double> obj3= new Displayer<>();
    obj3.setNum(20.0);
    obj3.display();

    //UsingObject: No type safety
    // UsingObject obj4 = new UsingObject();
    // obj4.setNum(20);
    // obj4.display();
    UsingObject obj4 = new UsingObject();
    obj4.setNum(20.0);
    obj4.display();

    //Using custom classes. Student, Teacher, College
    Displayer<Student> obj5 = new Displayer<>();
    obj5.setNum(new Student());
    obj5.display();
  }
}

class College{
  void printCollegeName(){
    System.out.println("ABC Institute of Technology");
  }
}
class Student extends College{
    void printName(){
      System.out.println("Student name is Printed");
    }
  }
class Teacher extends College{
    void printName(){
      System.out.println("Teacher name is printed");
    }
  }
