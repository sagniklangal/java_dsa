import java.util.*;
public class MyMap {
  public static void main(String[] args) {
    Map<Integer, String> classMap = new HashMap<>();
    
    // Map<Integer, String> classMap = new LinkedHashMap<>(); //Maintains the insertion order

    // classMap.put(1, "Sagnik");
    // classMap.put(2, "Rahul");
    // System.out.println(classMap);
    // classMap.put(1, "Palash");
    // System.out.println(classMap);
    // classMap.putIfAbsent(1, "Paresh");
    // System.out.println(classMap);
    // classMap.put(1, "Neha");

    // System.out.println(classMap);

    classMap.put(1, "Sagnik");
    classMap.put(2, "Rahul");
    System.out.println(classMap);
    classMap.put(3, "Palash");
    System.out.println(classMap);
    classMap.putIfAbsent(4, "Paresh");
    System.out.println(classMap);
    classMap.put(5, "Neha");

    System.out.println(classMap);

    System.out.println(classMap.get(4));

    // System.out.println(classMap.get(6));
    System.out.println(classMap.getOrDefault(4, "No one"));

    System.out.println(classMap.containsKey(4));

    System.out.println(classMap.containsValue("Paresh")); //Traverses whole map to search the value(linear), type sensitive

    //Traverse
    // for(Map.Entry<Integer, String> entry : classMap.entrySet()){
    //   System.out.print("key: " + entry.getKey());
    //   System.out.println(" Value: " + entry.getValue());
    // }

    //Traversing the keys only
    // for(Integer key : classMap.keySet()){
    //   System.out.println("key: " + key);
    // }


    //Traversing the values only
    for(String value : classMap.values()){
      System.out.println("value: " + value);
    }
  }
}
