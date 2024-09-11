package lesson_3;

import java.util.List;

public class Ex005_ListOf {
  public static void main(String[] args) {
    Character value = null;
    List<Character> list1 = List.of('D', 'u', 'm', 'i', 't', 'r', 'u');
    System.out.println(list1);
    // list1.remove(1);
    List<Character> list2 = List.copyOf(list1);
    System.out.println(list2);
  }
}
