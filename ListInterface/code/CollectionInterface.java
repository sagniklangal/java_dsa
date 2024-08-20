import java.util.*;


class MyCollection{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    // System.out.println(list.size());

    // List<Integer>
    // Integer, Character = Generics in java(Wrapping)
    // List stores only objects

    int x = 1;
    list.add(Integer.valueOf(x));
    list.add(x); //Compiler does it automatically

    // Autoboxing

    // int --> Integer
    // char --> Character

    List<int[]> list1 = new ArrayList<>();
    int y[] = {1};
    list1.add(y);
    System.out.println(list1);
    // Array names are references(object type), so it prints the address that the reference points to

  }
}