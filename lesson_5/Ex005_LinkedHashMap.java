package lesson_5;
import java.util.*;
public class Ex005_LinkedHashMap {
public static void main(String[] args) {
  Map<Integer, String> linkmap = new LinkedHashMap<>();
  linkmap.put(11, "one one");
  linkmap.put(1, "tow");
  linkmap.put(2, "one");
  System.out.println(linkmap);
  Map<Integer, String> map = new HashMap<>();
  map.put(11, "one one");
  map.put(1, "tow");
  map.put(2, "one");
  System.out.println(map);
}
}
