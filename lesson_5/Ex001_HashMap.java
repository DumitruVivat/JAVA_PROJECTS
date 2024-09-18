package lesson_5;
import java.util.*;

public class Ex001_HashMap {
  public static void main(String[] args) {
    Map<Integer, String> db = new HashMap<>();
    // db.put(1, "one");
    // System.out.println(db);
    // db.put(2, "two");
    // System.out.println(db);
    // db.put(3, "three");
    // System.out.println(db);
    // db.put(31, "three one");
    // System.out.println(db);
    // db.put(13, "one three");
    // System.out.println(db);
    // db.put(null, "!null");
    // System.out.println(db);
    // db.put(null, null);
    // System.out.println(db);

    db.put(null, "one");
    System.out.println(db);
    db.put(2, "two");
    System.out.println(db);
    db.put(3, "three");
    System.out.println(db);
    db.putIfAbsent(1, "put if absent");
    System.out.println(db);
    System.out.println("get(): " + db.get(3));
    System.out.println("remove(): "+db.remove(3));
    System.out.println(db);
    System.out.println("containsValue(): " + db.containsValue("put if absent"));
    System.out.println("containsKey(): " + db.containsKey(null));
    System.out.println("keySet(): " + db.keySet());
    System.out.println("values(): " + db.values());
  }
}
