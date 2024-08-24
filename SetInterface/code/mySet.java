import java.util.*;
public class mySet {
  public static void main(String[] args) {
    // Set<Integer> set = new HashSet<>();

    // Set<Integer> set = new LinkedHashSet<>(); //For maintaining insertion order

    Set<Integer> set = new TreeSet<>(); //For maintaining sorted order

    // set.add(2);
    // set.add(1);
    // set.add(1);
    // set.add(1);
    // set.add(1);
    // System.out.println(set);

    // System.out.println(set.contains(1));
    // System.out.println(set.contains(4));

    // System.out.println(set.remove(1));
    // System.out.println(set);

    set.add(2);
    set.add(1);
    set.add(4);
    set.add(5);
    set.add(3);


    //Traverse
    Iterator<Integer> itr = set.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
