import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class myTreeMap {
  public static void main(String[] args) {
    
    //Reverse order
    // Map<Integer, String> treeMap = new TreeMap<>( Collections.reverseOrder());

    //Normal order
    Map<Integer, String> treeMap = new TreeMap<>();

    treeMap.put(1, "Sagnik");
    treeMap.put(7, "Rahul");
    System.out.println(treeMap);
    treeMap.put(3, "Palash");
    System.out.println(treeMap);
    treeMap.putIfAbsent(2, "Paresh");
    System.out.println(treeMap);
    treeMap.put(11, "Neha");

    System.out.println(treeMap);

    treeMap.put(1, treeMap.getOrDefault(1, "No one") + " Langal");

    treeMap.put(6, treeMap.getOrDefault(6, "No one") + " Langal");

    System.out.println(treeMap); 
  }
}
