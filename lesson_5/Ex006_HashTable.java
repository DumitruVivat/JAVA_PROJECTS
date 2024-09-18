package lesson_5;

import java.util.*;

public class Ex006_HashTable {
  public static void main(String[] args) {
    Map<Integer, String> table = new Hashtable<>();
    table.put(1, "two");
    table.put(11, "one one");
    table.put(2, "one");
    System.out.println(table);
    // table.put(null, "one");
  }
}
