import java.util.*;
public class MyList {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(7);
    list.add(3);
    list.add(7);
    System.out.println(list);
    System.out.println("Current size is: "+list.size());
    
    list.remove(Integer.valueOf(5)); //deletion by value
    System.out.println(list);
    list.remove(2); //deletion by index
    System.out.println(list);

    System.out.println(list.contains(7));

    System.out.println(list.get(2));

    list.set(0, 9);
    System.out.println(list);

    list.remove(Integer.valueOf(7)); //Deletes the first occurence of 7(In case of duplicate values)
    System.out.println(list);

    // Iterating the list and printing
    Iterator<Integer> itr = list.iterator();
    ListIterator<Integer> itr1 = list.listIterator();

    System.out.print("My list is --> ");
    while (itr.hasNext()) {
      System.out.print(itr.next());
      System.out.print(" ");
    }
    System.out.println();

    System.out.print("My list is --> ");
    while (itr1.hasNext()) {
      System.out.print(itr1.next());
      System.out.print(" ");
      if (itr1.hasPrevious()) {
        System.out.println(itr1.previous());
        break;
      }
    }
    System.out.println();


    //Sorting
    list.sort(new Comparator<Integer>() {
      // A-B = negative, A<B, first A then B,
      // B-A = positive, A>B, first B then A
      public int compare(Integer A, Integer B){
        return A-B; //Ascending order
        // return B-A; //Descending order
      }
    });
    System.out.println(list);

    List<Student> list1 = new ArrayList<>();
    list1.add(new Student(1, "Sagnik"));
    list1.add(new Student(2, "Rahul"));
    list1.add(new Student(3, "Palash"));
    list1.add(new Student(3, "Amit"));

    list1.sort(new Comparator<Student>() {
      public int compare(Student A, Student B){
        //Sorting descending roll no including duplicate roll no(Sort alphabetically in this case)
        int res = B.rollNumber - A.rollNumber;
        if (res == 0) {
          // return A.name.compareTo(B.name); //Alphabetically ascending

          return B.name.compareTo(A.name); //Alphabetically ascending
        }
        return res;

        //Sorting descending roll no
        // return B.rollNumber - A.rollNumber;
      }
    });

    System.out.println(list1);
  }
}

class Student{
  int rollNumber;
  String name;

  public Student(int rollNumber, String name){
    this.rollNumber = rollNumber;
    this.name = name;
  }

  public String toString(){
    return name;
  }
}
