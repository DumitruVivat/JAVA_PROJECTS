package lesson_5;
import java.util.*;
public class Ex004_ThreeMap {
  public static void main(String[] args) {
    TreeMap<Integer, String> tMap = new TreeMap<>();
    tMap.put(1, "one");
    System.out.println(tMap);
    tMap.put(6, "six");
    System.out.println(tMap);
    tMap.put(4, "four");
    System.out.println(tMap);
    tMap.put(3, "three");
    System.out.println(tMap);
    tMap.put(2, "two");
    System.out.println(tMap);
    System.out.println("get(): " + tMap.get(4));
    System.out.println("remove(): " + tMap.remove(1));
    System.out.println("descendingKeySet(): " + tMap.descendingKeySet());
    System.out.println("descendingMap(): " + tMap.descendingMap());
    System.out.println("tailMap(): " + tMap.tailMap(4));
    System.out.println("headMap(): " + tMap.headMap(4));
    System.out.println("lastEntry(): " + tMap.lastEntry());
    System.out.println("firstEntry(): " + tMap.firstEntry());
  }
}
